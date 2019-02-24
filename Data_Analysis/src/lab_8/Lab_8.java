/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8;

import java.io.IOException;
import java.util.Map;
import lab_8.analytics.AnalysisHelper;
import lab_8.analytics.DataStore;
import lab_8.entities.Comment;
import lab_8.entities.Post;
import lab_8.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class Lab_8 {

    DataReader commentReader;
    DataReader userReader;
    AnalysisHelper helper;
    
    public Lab_8() throws IOException {
        DataGenerator generator = DataGenerator.getInstance();
        commentReader = new DataReader(generator.getCommentFilePath());
        userReader = new DataReader(generator.getUserCataloguePath());
        helper = new AnalysisHelper();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {     
        Lab_8 inst = new Lab_8();
        inst.readData();
    }
    
    private void readData() throws IOException{
        String[] row;
        while((row = userReader.getNextRow()) != null ){
            generateUser(row);
        }
        while((row = commentReader.getNextRow()) != null ){
            Comment comment = generateComment(row);
            generatePost(row, comment);
        }
        
        runAnalysis();
    }
    
    private void generateUser(String[] row){
        int userId = Integer.parseInt(row[0]);
        User u = new User(userId, row[1], row[2]);
        DataStore.getInstance().getUsers().put(userId,u);
    }
    
    private Comment generateComment(String[] row){
        
      int commentId = Integer.parseInt(row[0]);
        int commentinguserId = Integer.parseInt(row[4]);
        int likes = Integer.parseInt(row[3]);
        int postId = Integer.parseInt(row[1]);
        String comment = row[5];
        Comment c = new Comment(commentId,commentinguserId, postId, comment,likes);
        DataStore.getInstance().getComments().put(commentId,c);
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        
        if(users.containsKey(commentinguserId)){
            users.get(commentinguserId).getComments().add(c);
           int x= users.get(commentinguserId).getTotalComments();
           users.get(commentinguserId).setTotalComments(++x);
        }
        else{

             User u = new User(commentinguserId, row[1], row[2]);
             u.setTotalComments(1);
             DataStore.getInstance().getUsers().put(commentinguserId,u);
             //users.get(commentinguserId).setTotalComments(1);
          }
        return c;
    }
    
    private void generatePost(String[] row, Comment comment){
        int postId = Integer.parseInt(row[1]);
        int userId = Integer.parseInt(row[2]);
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        if(posts.containsKey(postId)){
            posts.get(postId).getComments().add(comment);
           int y=posts.get(postId).getTotalcomments();
            posts.get(postId).setTotalcomments(y++);
            
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        if(users.containsKey(userId)){
           int w= users.get(userId).getTotalposts();
           users.get(userId).setTotalposts(++w);
        }
        else{
            User u = new User(userId, row[1], row[2]);
            u.setTotalposts(1);
            DataStore.getInstance().getUsers().put(userId,u);
             //users.get(commentinguserId).setTotalComments(1);
          }
        }
        
        else{
            Post post = new Post(postId, userId);
            post.getComments().add(comment);
            posts.put(userId, post);
            int y=posts.get(userId).getTotalcomments();
            posts.get(userId).setTotalcomments(y++);
            Map<Integer,User> users = DataStore.getInstance().getUsers();
            if(users.containsKey(userId)){
            int w= users.get(userId).getTotalposts();
            users.get(userId).setTotalposts(++w);
            }
            else{
            User u = new User(userId, row[1], row[2]);
            u.setTotalposts(1);
            DataStore.getInstance().getUsers().put(userId,u);
             //users.get(commentinguserId).setTotalComments(1);
            }
      }
        
    }
    
    private void runAnalysis(){
       helper.userWithMostLikes();
       helper.getFiveMostLikedComment();
       helper.avgLikes();
       helper.postmostlikedcomments();
       helper.postmostcomments();
       helper.fiveinactiveuserscomments();
       helper.fiveimactiveusersposts();
       helper.fiveinactiveusers();
       helper.fiveactiveusers();
    }
    
}

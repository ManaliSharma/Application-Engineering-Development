/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import lab_8.entities.Comment;
import lab_8.entities.Post;
import lab_8.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    
    
    public void userWithMostLikes(){
        Map<Integer, Integer> userLikeAccount= new HashMap<Integer, Integer>();
        Map<Integer,User> users=DataStore.getInstance().getUsers();
        for(User user:users.values()){
            for(Comment c: user.getComments()){
                int likes=0;
                if(userLikeAccount.containsKey(user.getId()))
                {
                    likes =userLikeAccount.get(user.getId());
                    
                }
                    likes+=c.getLikes();
                    
                    userLikeAccount.put(user.getId(),likes);
                
                
                }
            }
        
        int max=0;
        int maxid=0;
        for(int id:userLikeAccount.keySet()){
            if(userLikeAccount.get(id) > max){
                max=userLikeAccount.get(id);
                maxid=id;
            
            }
        }
        System.out.println("User with most likes"+max+"\n"+users.get(maxid));
    }
    
    public void getFiveMostLikedComment(){
        
        Map<Integer, Comment> comments=DataStore.getInstance().getComments();
        
       List<Comment> commentList =new ArrayList<>(comments.values());
       
       Collections.sort(commentList, new Comparator<Comment>() {

            @Override
            public int compare(Comment o1, Comment o2) {
                //so as to get descending list
                return o2.getLikes()-o1.getLikes();    
            
            
            }
        });
       System.out.println("5 most liked comments: ");
       for(int i=0;i<commentList.size()&& i<5 ;i++){
       
           System.out.println(commentList.get(i));
       
       
       }
       
 
    
    }
    
    public void avgLikes(){
        
    }
    
    public void postmostlikedcomments(){
        
    }
    
    public void postmostcomments(){
        Map<Integer, Post> posts=DataStore.getInstance().getPosts(); 
            List<Post> postList =new ArrayList<>(posts.values());  
                Collections.sort(postList, new Comparator<Post>() {
                    @Override
                    public int compare(Post o1, Post o2) {          //so as to get descending list
                    return o2.getTotalcomments()-o1.getTotalcomments();    
                    }
                });      
            System.out.println("Post ID with most comments "+postList.get(0));        
    }
    
        


    public void fiveinactiveuserscomments(){   

       Map<Integer, User> users=DataStore.getInstance().getUsers();
        
       List<User> userList =new ArrayList<>(users.values());
       
       Collections.sort(userList, new Comparator<User>() {

            @Override
            public int compare(User o1, User o2) {
                //so as to get descending list
                return o2.getTotalComments() - o1.getTotalComments();
            }
        });
      
       System.out.println("5 users on the basis of comments: ");
       for(int i=0;i<userList.size()  && i<5 ;i++){
       
           System.out.println(userList.get(i));
       
       
       }
        

    }
    
    public void fiveimactiveusersposts(){
        
       Map<Integer, User> users=DataStore.getInstance().getUsers();
        
       List<User> userList =new ArrayList<>(users.values());
       
       Collections.sort(userList, new Comparator<User>() {

            @Override
            public int compare(User o1, User o2) {
                //so as to get descending list
                return o2.getTotalposts() - o1.getTotalposts();
            }
        });
      
       System.out.println("5 users on the basis of posts: ");
       for(int i=0;i<userList.size()  && i<5 ;i++){
       
           System.out.println(userList.get(i));
       
       
       }
              
    }
    
    public void fiveinactiveusers(){
       Map<Integer, User> users=DataStore.getInstance().getUsers();
       List<User> userList =new ArrayList<>(users.values());
       
       for(int i=0;i <userList.size();i++){
            
            userList.get(i).setTotal(userList.get(i).getTotalComments()+userList.get(i).getTotalposts());
     
        }
      
       Collections.sort(userList, new Comparator<User>() {

            @Override
            public int compare(User o1, User o2) {
                //so as to get descending list
                return o2.getTotal() - o1.getTotal();
            }
        });
      
       System.out.println("5 users on the basis of posts and comments: ");
       for(int i=userList.size()-1 ;i<userList.size()  ;i--){
           if(i>0 && i<6){
       
           System.out.println(userList.get(i));
       
            } 
       
        }
       
    }
    
    public void fiveactiveusers(){
        Map<Integer, User> users=DataStore.getInstance().getUsers();
            List<User> userList =new ArrayList<>(users.values());
                for(int i=0;i <userList.size();i++){
                    userList.get(i).setTotal(userList.get(i).getTotalComments()+userList.get(i).getTotalposts());  
                }  
       Collections.sort(userList, new Comparator<User>() {
            @Override
                public int compare(User o1, User o2) {
                    return o2.getTotal() - o1.getTotal();          //to get descending list
                }
        });
       System.out.println("5 users on the basis of posts and comments: ");
            for(int i=0 ;i<userList.size() && i<5 ;i++){
                System.out.println(userList.get(i));      
            }   
    }
}

        
      
 
    
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
   
      
   



package com.maCueva.sims.Service;
import java.util.List;
import java.util.NoSuchElementException;

import com.maCueva.sims.Entity.UserEntity;
import com.maCueva.sims.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    UserRepository urepo;

    //create
    public UserEntity register(UserEntity User){
       return urepo.save(User);
    }
    
    //log in
    public int Login( String username,String password) throws Exception{
    	int valid = 0;
    	String pass = urepo.findByUsername(username).getPassword();
        try {        	
        if(urepo.findByUsername(username)!= null) {        	
        		if(pass.equals(password)) {
        			return urepo.findByUsername(username).getUserId();
        		
        		}
        }	
        }catch(NoSuchElementException nex) {
            //throws an error if the id does not exist
            return 0;
        }
		return 0;
        
     }
    
    public int UserType(int id) throws Exception{
  
        try {        	
        if(urepo.findById(id) != null) {        	
        
        	return urepo.findById(id).get().getUserType();
        }	
        }catch(NoSuchElementException nex) {
            //throws an error if the id does not exist
            throw new Exception("");
        }
		return 0;
        
     }

    
    
    //display
    public List<UserEntity> displayAll(){
        return urepo.findAll();
    }
}

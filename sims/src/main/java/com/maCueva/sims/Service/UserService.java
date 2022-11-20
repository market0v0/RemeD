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
        			if(urepo.findByUsername(username).getUserType() == 1) {
        				valid = 1;
        				return valid;
        			}
        			else {
        				valid = 2;
        				return valid;
        			}
        		
        		}
        }	
        }catch(NoSuchElementException nex) {
            //throws an error if the id does not exist
            throw new Exception("ID Number "+ username + " does not exist!");
        }
		return valid;
        
     }

    
    
    //display
    public List<UserEntity> displayAll(){
        return urepo.findAll();
    }
}

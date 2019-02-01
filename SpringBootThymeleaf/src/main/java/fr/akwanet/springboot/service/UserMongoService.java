package fr.akwanet.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.akwanet.springboot.model.User;

@Service
@Transactional
public class UserMongoService {
	
	@Autowired
    private MongoTemplate mongoTemplate;

	/**
	 * Add new user
	 * @param user
	 * @return
	 */
	public Boolean addUser(User user) {
		try {
			//org.springframework.data.mongodb.core.MongoFactoryBean d;
//			Residence resid = new Residence(id, type, cityCode, districtCode, label, equipment, otherEquip, priceMin, priceMax, surfaceMin, surfaceMax,
//					piecesNumMin, piecesNumMax, firstFloor, lastFloor, description, new Date());
			
			mongoTemplate.save(user);
			
			return true;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	/**
	 * Find a user
	 * @param user
	 * @return
	 */
	public User getUser(String userId) {
		try {
			
//			Query query = new Query();
//			query.addCriteria(Criteria.where("userId").is(userId));
			User user = mongoTemplate.findById(userId, User.class);		
			
			return user;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	/**
	 * Get users list
	 * @param user
	 * @return
	 */
	public List<User> getUsers() {
		try {
			
			List<User> users = mongoTemplate.findAll(User.class);	
			
			return users;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}

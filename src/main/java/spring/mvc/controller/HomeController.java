package spring.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.model.User;

@Controller
public class HomeController {

	public List<User> listUsers(){
		List<User> listUsers=new ArrayList<User>();
		listUsers.add(new User(1, "AAAAAAAAA", "POIIPIPIP"));
		listUsers.add(new User(2, "BBBBBBBBB", "jhoPOOKK98"));
		listUsers.add(new User(3, "CCCCCCCCC", "PIIOIOPUIPOJ"));
		return listUsers;
	}
	
	public User user=new User(6, "UHUIYUU", "NIUHIO*&(&(&88");
	
	public Set<User> setUsers(){
		Set<User> setUsers=new HashSet<User>();
		setUsers.add(new User(4, "DDDDDDD", "OIJPOjpoIOP"));
		setUsers.add(new User(5, "DFFFFFFFF", "IJIOPJPOUJPO"));
		setUsers.add(user);
		setUsers.add(user);
		return setUsers;
	}
	
	public Map<Integer, User> map(){
		Map<Integer, User> map=new HashMap<Integer, User>();
		map.put(7, new User(7, "FFFFFFAA", "KHLJHL89"));
		map.put(8, new User(8, "IUIUIUI", "NKHJIOJ()"));
		map.put(9, new User(9, "UUTUT", "JIJH99"));
		return map;
	}
	
	@RequestMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("list", this.listUsers());
		model.addAttribute("set", this.setUsers());
		model.addAttribute("map", this.map());
		return "index";
	}
	
}

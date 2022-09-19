package com.example.qlchuyenbay.controller;






import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.qlchuyenbay.model.ChuyenBay;
import com.example.qlchuyenbay.service.ChuyenBayService;





@RestController

public class ChuyenBayController {
	private ChuyenBayService chuyenBayDao;

	@Autowired
	public ChuyenBayController( ChuyenBayService employeeDao) {
		super();
		this.chuyenBayDao = employeeDao;
	}
	
	@GetMapping("/chuyenbay/diemden")
	public List<ChuyenBay> getChuyenBayByDiemDen(@RequestParam String diemDen){
		System.out.println(diemDen);
		return chuyenBayDao.getChuyenBayByDiemDen(diemDen);
	}
	

}

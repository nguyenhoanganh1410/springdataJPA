package com.example.qlchuyenbay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "chungnhan")
public class ChungNhan {
	
	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @ManyToOne
	    @MapsId("maNV")
	    @JoinColumn(name = "MaNV")
	    NhanVien nhanVien;

	    @ManyToOne
	    @MapsId("maMB")
	    @JoinColumn(name = "MaMB")
	    MayBay mayBay;

		public ChungNhan(NhanVien nhanVien, MayBay mayBay) {
			super();
			this.nhanVien = nhanVien;
			this.mayBay = mayBay;
		}

		public ChungNhan() {
			super();
		}

		public NhanVien getNhanVien() {
			return nhanVien;
		}

		public void setNhanVien(NhanVien nhanVien) {
			this.nhanVien = nhanVien;
		}

		public MayBay getMayBay() {
			return mayBay;
		}

		public void setMayBay(MayBay mayBay) {
			this.mayBay = mayBay;
		}

	  
	    // standard constructors, getters, and setters
	    
}

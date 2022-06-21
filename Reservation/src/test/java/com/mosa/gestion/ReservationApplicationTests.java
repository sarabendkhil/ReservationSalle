package com.mosa.gestion;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mosa.gestion.entities.SalleTP;
import com.mosa.gestion.repos.SalleTPRepository;

@SpringBootTest
class ReservationApplicationTests {
	@Autowired
	private SalleTPRepository salleTPRepository;

	@Test
	public void testCreateSalleTP() {
		SalleTP satp = new SalleTP("IEEE","developpement");
		salleTPRepository.save(satp);
		}
	
	@Test
	public void testFindSalleTP()
	{
		SalleTP p = salleTPRepository.findById(1L).get();

	System.out.println(p);
	}
	@Test
	public void testUpdateSalleTP()
	{
		SalleTP p = salleTPRepository.findById(1L).get();
	salleTPRepository.save(p);
	}
	@Test
	public void testDeleteSalleTP()
	{
	salleTPRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousSalleTPs()
	{
	List<SalleTP> satps = salleTPRepository.findAll();
	for (SalleTP p : satps)
	{
	System.out.println(p);
	}

	}

}

package com.gateside.autotesting.generation.unittest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.gateside.autotesting.Gat.executor.CaseExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceSingleStepExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceStepsExecutor;

public class BlockListTestCase {

	@BeforeTest
	public void beforeTestMethod(){
	}
	
	@BeforeMethod
	public void beforeMethod(){
	}
	
	
	@Test
	public void Test01NotLoginBlockList() throws Exception{
		CaseExecutor executor = new InterfaceStepsExecutor("BlockListTestCase.xml","Test01");
		executor.execute();
	}
	
	@Test
	public void Test02LoginBlockList() throws Exception{
		CaseExecutor executor = new InterfaceStepsExecutor("BlockListTestCase.xml","Test02");
		executor.execute();
	}
	
	@Test
	public void Test03BlockListNotNull() throws Exception{
		CaseExecutor executor = new InterfaceStepsExecutor("BlockListTestCase.xml","Test03");
		executor.execute();
	}
	
	@Test
	public void Test04BlockListNull() throws Exception{
		CaseExecutor executor = new InterfaceStepsExecutor("BlockListTestCase.xml","Test04");
		executor.execute();
	}
	
	
	@AfterMethod
	public void afterMethod(){
	}
	
	@AfterClass
	public void afterClassMethod(){
	}
}


package test;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import main.Book;
import main.Loan;
import main.Member;

public class TestOne {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		 	Book book1 = new Book("001","ENG","《English level 1》");
	        Book book2 = new Book("002","ENG2","《English level 2》");
	        Book book3 = new Book("003","ENG3","《English level 3》");
	        Book book4 = new Book("003","ENG4","《English level 4》");
	        
	        Member member1 = new Member("user1","测试1");
	        
	        List<Loan> loanList=new ArrayList();
	       
	        System.out.println(LocalDateTime.now()+"用户1借阅《English level 1》");
	        if(member1.CanLoan(book1)){
	        	member1.Loan(book1);
	        }
	        System.out.println(LocalDateTime.now()+"用户1再次借阅《English level 1》");
	        if(member1.CanLoan(book1)){
	        	member1.Loan(book1);
	        }
	        System.out.println(LocalDateTime.now()+"用户1借阅《English level 2》");
	        if(member1.CanLoan(book2)){
	        	member1.Loan(book2);
	        }
	        System.out.println(LocalDateTime.now()+"用户1借阅《English level 3》");
	        if(member1.CanLoan(book3)){
	        	member1.Loan(book3);
	        }
	        System.out.println(LocalDateTime.now()+"用户1借阅《English level 4》");
	        if(member1.CanLoan(book4)){
	        	member1.Loan(book4);
	        }
	        System.out.println(LocalDateTime.now()+"用户1归还《English level 1》");
	        member1.Return(book1);
	        
	        System.out.println("======================================================================");
	        System.out.println(LocalDateTime.now()+"用户1再次借阅《English level 1》");
	        if(member1.CanLoan(book1)){
	        	member1.Loan(book1);
	        }
	        
	}

}

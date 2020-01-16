package jp.dcnet.xxx;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import jp.dcnet.ssstest.Student;

import org.junit.Before;
import org.junit.Test;

public class StudentTest{

	Student student;

	@Before
	public void setup(){
		student = new Student("01", 50, 50, 50, 50, 50);
	}

	@Test
	public void test1(){
		assertThat(student.isPass(),is(true));
	}

	@Test
	public void test2(){
		student.setSubject1(49);
		assertThat(student.isPass(),is(false));
	}

	@Test
	public void test3(){
		student.setSubject2(49);
		assertThat(student.isPass(),is(false));
	}

	@Test
	public void test4(){
		student.setSubject3(49);
		assertThat(student.isPass(),is(false));
	}

	@Test
	public void test5(){
		student.setSubject4(49);
		assertThat(student.isPass(),is(false));
	}

	@Test
    public void test6() {
        student.setSubject5(49);
        assertThat(student.isPass(), is(false));
	}

}

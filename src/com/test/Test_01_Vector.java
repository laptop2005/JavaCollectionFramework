package com.test;

import java.util.Vector;


public class Test_01_Vector {

	
	public void testVector_1(){
		Vector v = new Vector();
		
		//최초 벡터의 사이즈를 출력해보면 0이다
		System.out.println(v.size());
		
		//벡터는 add명령어를 통하여 리스트에 데이터나 객체를 추가할 수 있다.
		//벡터는 add할때 잘 추가되었는지 여부를 boolean값으로 반환한다.
		boolean isAdd_1 = v.add("aaa");
		boolean isAdd_2 = v.add("bbb");
		boolean isAdd_3 = v.add(111);
		boolean isAdd_4 = v.add('a');
		boolean isAdd_5 = v.add(true);
		
		//데이터를 벡터에 추가한 후 사이즈를 출력해보면 추가한 갯수만큼이 출력된다.
		System.out.println(v.size());
		
		//addElement는 기본적으로 add와 같은 기능을 한다 
		//차이점은 addElement가 데이터를 추가할때 데이터 동기화를 한다고 하는데
		//신뢰성이 떨어져 synchronize 블럭으로 처리하는 것을 권장한다.
		v.addElement("ccc");
		
		System.out.println(v.size());
		
		//현재 벡터의 0번째에는 "aaa"가 들어있다.
		System.out.println(v.get(0));
		
		//벡터에서 이 인덱스를 지정하여 add하면 해당 인덱스에 데이터를 끼워넣고  
		//그 뒤의 데이터들은 한칸씩 뒤로 밀려 인덱스가 1씩 증가하게 된다.
		v.add(1,"ddd");
		System.out.println(v.get(1));
		
		//set 메소드를 사용하면 해당 인덱스에 있던 데이터를 리턴으로 반환하고
		//지정해준 데이터를 그 자리에 덮어쓰게 된다.
		String v0 = (String)v.set(0, "eee");
		System.out.println(v0);
		System.out.println(v.get(0));
		
		
		//remove메소드를 사용하여 해당 인덱스에 있는 데이터를 벡터로부터 삭제할 수 있다.
		//데이터를 삭제하게 되면 벡터의 사이즈도 자연히 줄어들게 된다.
		//또한 삭제한 데이터의 밑에 있던 데이터부터 올라와 그 자리를 채우게 된다.
		//데이터를 삭제할 때 삭제되는 데이터를 결과값으로 받을 수 있다.
		System.out.println(v.get(0)+":"+v.size());
		String removeItem = (String)v.remove(0);
		System.out.println("removeItem:"+removeItem);
		System.out.println(v.get(0)+":"+v.size());
		
	}
	
	public void testVector_2(){
		//제네릭 타입(generic type)이라는 것은 
		//객체 선언시에 <> 안에 그 리스트가 사용할 데이터 타입을 정해주는 것이다.
		//이러한 식으로 선언하게 되면 그 데이터 타입 외에 다른 데이터타입을 리스트에 넣을 수 없다.
		//또한 제네릭으로 선언될 수 있는 데이터타입은 클래스이어야 한다.
		//그래서 int 데이터는 Integer로 대체하고 boolean은 Boolean, char은 Character 등으로 대체하여 사용한다.
		//제네릭 타입으로 선언하게 되면 데이터를 get 하였을때 별도의 형변환이 없이 바로 사용이 가능하다.
		Vector<String> v1 = new Vector<String>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Boolean> v3 = new Vector<Boolean>();
		Vector<Character> v4 = new Vector<Character>();
		Vector v = new Vector();
		
		v.add("AAA");
		//이렇게 제네릭으로 선언되지 않은 벡터는 데이터를 가져올 때 가져오는 데이터에 맞는 형변환을 해주어야 한다.
		String aaa = (String)v.get(0);
		
		v1.add("XXX");
		
		//그러나 제네릭으로 데이터 타입이 정해져 있는 경우는 별도의 형변환이 없이 사용이 가능하다.
		String xxx = v1.get(0);
	}
	
	public void testVector_3(){
		//벡터에는 단순한 데이터 타입만 담을수 있는것이 아니라
		//각종 클래스도 담을 수 있다.
		Vector<TestVO> v = new Vector<TestVO>();
		
		TestVO vo1 = new TestVO();
		vo1.setStr1("AAA");
		vo1.setInt1(111);
		vo1.setChr1('a');
		
		v.add(vo1);
		
		//제네릭으로 TestVO가 지정되어 있으므로 별도의 형변환 없이 
		//벡터에서 get한 이후에 TestVO의 메소드를 바로 사용이 가능하다.
		System.out.println(v.get(0).getStr1()+","+v.get(0).getInt1());
		
		v.get(0).setStr1("BBB");
		System.out.println(v.get(0).getStr1());
	}
	
	public void testVector_4(){
		//벡터에서 데이터 삭제 시 인덱스로만 삭제할 수 있는것이 아니라
		//벡터에 있는 데이터를 찾아 삭제할 수 있다.
		//그러나 삭제는 한번만 이루어지게 된다.
		//무슨말이냐면 같은 데이터가 여러개 있다면 가장 앞에있는 데이터 하나만 삭제한다는 뜻이다.
		Vector<String> v = new Vector<String>();
		v.add("AAA");
		v.add("BBB");
		v.add("CCC");
		v.add("AAA");
		v.add("AAA");
		
		v.remove("AAA");
		
		//벡터안에 있는 같은 데이터를 모두 삭제하고 싶다면
		//Collection 객체에 삭제할 데이터를 담아 removeAll 해주면
		//해당 모든 데이터가 삭제된다.
		Vector v1 = new Vector();
		v1.add("AAA");
		v.removeAll(v1);
		
		System.out.println(v.size());
	}
	
	public void testVector_5(){
		Vector v = new Vector();
		v.add("AAA");
		v.add("BBB");
		v.add("CCC");
		v.add("DDD");
		v.add("EEE");
		
		//벡터에서 데이터를 순서대로 모두 가져오고 싶다면
		//for문을 사용하는 경우가 가장 많다
		
		//가장 기본적으로 이러한 형태의 for문을 많이 사용하나 
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}
		
		//Collection에서는 for문을 단축한 형태로도 사용이 가능하다.
		//이렇게 사용하게 되면 벡터에서 쌓여있는 데이터를 하나씩 가져오게 된다.
		//Object로 지정한 이유는 벡터의 제네릭 타입을 지정해주지 않았기 때문이며
		//제네릭을 지정해준 벡터에서는 그 지정한 타입의 클래스로 선언하면 된다.
		for(Object item:v){ 
			System.out.println(item);
		}
	}
	
	public static void main(String[] args) {
		
		Test_01_Vector obj = new Test_01_Vector();
		obj.testVector_4();
	}
}

package Emplo2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;





class Employee{//사원의 정보를 담은 클래스
	int empNo; //사원번호
	String empName; // 사원이름
	String phone; //연락처
	int age;//나이
	String dept; //부서
	String compRank; //직급
	
	public Employee() {}//기본 생성자

	public Employee(int empNo, String empName, String phone, int age, String dept, String comRank) {
		this.empNo = empNo;
	      this.empName = empName;
	      this.phone = phone;
	      this.age = age;
	      this.dept = dept;
	      this.compRank = comRank;
	
	}//생정자

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCompRank() {
		return compRank;
	}

	public void setCompRank(String compRank) {
		this.compRank = compRank;
	} //게터 세터 메서드
} //클래스 Employyee
	public class Employee_Infoo{
		private static TreeSet<Employee> set;
		public static void main(String[] args) {
			set = new TreeSet<Employee>(new Comparator<Employee>() {
				@Override
				public int compare(Employee o1, Employee o2) {
					if(o1.empNo < o2.empNo) {
						return 1;
					}else if(o1.empNo==o2.empNo) {
						return 0;
					}else {
						return -1;
					}
				}
				});	
			//set 인터페이스를 구현 Treeset 중복저장x 순서유지x
			 //TreeSet은 저장시 중복허용을 안하기 위해 compare()를 호출해서 비교 // Hashset은 equals, hashcode()
			Scanner sc = new Scanner(System.in);
		
			Employee_Infoo EI = new Employee_Infoo();
			int selectNo;
			
			do {
				System.out.println("=================사원관리프로그램==");
				System.out.println("# 1. 사원정보 신규등록");
				System.out.println("# 2. 사원정보 검색");
				System.out.println("# 3. 사원정보 수정");
				System.out.println("# 4. 사원정보 삭제");
				System.out.println("# 5. 프로그램 종료");
				System.out.println("번호 선택>>");
				selectNo = sc.nextInt();
				
				if(selectNo==5) {
//					System.out.println("프로그램이 종료 되었습니다");
					break;
				}else if(selectNo==1){
					EI.empInsert(sc);
				}else if(selectNo==2) {
					empList(sc);
				}else if(selectNo==3) {
					empEdit(sc);
				}else if(selectNo==4) {
					empDel(sc);
				}
			}while(true);
			
			System.out.println("프로그램이 종료되었습니다");
		}
		
	
		   
		private static void empInsert(Scanner sc) {
			Employee employ = new Employee();
		System.out.println("사원정보 입력");
		System.out.println("사원번호를 입력해주세요");
		employ.setEmpNo(sc.nextInt()); //객체생성하고 참조변수.메소드명
		System.out.println("이름을 입력해주세요");
		employ.setEmpName(sc.next());
		System.out.println("휴대전화 번호를 입력해주세요");
		employ.setPhone(sc.next());
		System.out.println("나이를 입력해주세요");
		employ.setAge(sc.nextInt());
		System.out.println("소속하신 부서를 입력해주세요");
		employ.setDept(sc.next());
		System.out.println("직급을 입력해주세요");
		employ.setCompRank(sc.next());
		
		
		set.add(employ);
		System.out.println(employ.getEmpName()+"님의 사원정보가 입력되었습니다");
	}  //empInsert 메소드
	
	
	private static void empList(Scanner sc) {
		System.out.println("사원 리스트==========");
		Iterator<Employee> ir = set.iterator();
		while(ir.hasNext()) {
			Employee employee = ir.next();
			if(employee !=null) {
				System.out.print(employee.getEmpNo());
				System.out.println("    ");
				System.out.println(employee.getEmpName());
				System.out.println("    ");
				System.out.println(employee.getPhone());
				System.out.println("    ");
				System.out.println(employee.getAge());
				System.out.println("    ");
				System.out.println(employee.getDept());
				System.out.println("    ");
				System.out.println(employee.getCompRank());
				System.out.println();
			}
		}
			
		}
		private static void empEdit(Scanner sc) {
			System.out.println("3. 사원 정보 수정=====================");
			System.out.println("수정할 사원번호:");
			int empno=sc.nextInt();

			Employee employee = findEmp(empno);
			
			if(employee==null) {
				System.out.println("결과 : 일치하는 사원번호가 없습니다");
				return;
			}
			int select=0;
			while(true) {
			System.out.println("수정할 필드 선택[1. 연락처, 2.나이 3.부서 4.직급");
			select = sc.nextInt();
			if(select==1) {
				System.out.println("수정할 연락처를 입력해주세요");
				employee.setPhone(sc.next());
				System.out.println("연락처가 변경되었습니다");
			}else if(select==2) {
				System.out.println("수정할 나이를 입력해주세요");
				employee.setAge(sc.nextInt());
				System.out.println("나이가 변경 되었습니다");
			}else if(select==3) {
				System.out.println("수정할 부서를 입력하세요");
				employee.setDept(sc.next());
				System.out.println("부서가 변경 되었씁니다");
			}else if(select==4) {
				System.out.println("수정할직급을 입력해주세요");
				employee.setCompRank(sc.next());
				System.out.println("직급이 변경되었습니다");
			}else if(select == 5) {
	             break;
	          }
			}
			
		}
	
	
		
		private static void empDel(Scanner sc) {
		      
		      System.out.println("삭제할 사번을 입력해주세요.");
		      int empno = sc.nextInt();
		      Employee employee = findEmp(empno);
		      
		      if(employee == null) {
		         System.out.println("결과 : 일치하는 사번이 없습니다.");
		         return;
		      }else {
		         set.remove(employee);
		         System.out.println("해당 사번이 삭제되었습니다.");
		      }
		      

		   }
	
	private static Employee findEmp(int ano) { //참조형 반환타입 기본형매개변수
		Employee employee = null;
		
		Iterator<Employee> ir =set.iterator();
		
		while (ir.hasNext()){
			Employee e1= ir.next();
			int dbno= e1.getEmpNo();
			if(dbno==ano) {
				employee=e1;
			}
			
		}
		return employee;
	}
	//반환타입이 참조형이라는건 객체의 주소를 반환
	
	}
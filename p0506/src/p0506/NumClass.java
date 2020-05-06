package p0506;
/*class Cal{
	int n1,n2,sum;//필드=변수(class안의 필드는 초기값을 주지 않아도 0으로 설정되어있다)
	float n3,n4;//main안에 변수는 초기값이 설정을 안하면 에러 
	
	Cal(){
		for(int i=1;i<=10;i++){
			sum=sum+i;//초기값 0을 주지 않아도 0으로 설정되어서 누적합계 가능
			
		}
		System.out.printf("sum:%d",sum);
		System.out.printf("%d\n",n1);
		System.out.printf("%d\n",n2);
		System.out.printf("%f\n",n3);
		System.out.printf("%f\n",n4);
	}
	Cal(int n1,int n2){
		this.n1=n1;//매개 변수와 같을 때는 this로 구분
		this.n2=n2;
		System.out.printf("%d+%d=%d\n",n1,n2,n1+n2);
	}
	Cal(float n1,int n2){//실수 +정수
		n3=n1;//매개 변수와 다른기 때문에 this X
		this.n2=n2;
		System.out.printf("%.1f + %d = %.1f\n",n3,n2,n3+n2);
	}
	Cal(int n1,float n2){//정수+실수
		this.n1=n1;//매개 변수와 다른기 때문에 this X
		n4=n2;
		System.out.printf("%d + %.1f = %.1f\n",n1,n4,n1+n4);
	}
	public Cal(float n3, float n4) {
		this.n3=n3;
		this.n4=n4;
		System.out.printf("%.1f + %.1f = %.1f\n",n3,n4,n3+n4);
	}
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	void print(){
		System.out.printf("%d+%d=%d\n",n1,n2,n1+n2);
	}
}*/
public class NumClass {

	public static void main(String[] args) {
		int num1=0;//메인에 초기값을 안주면 err
		System.out.printf("%d",num1);
		Cal c1=new Cal();
		/*c1.n1=15;
		c1.n2=10;*/
		c1.setN1(15);
		c1.setN2(10);
		c1.print();

		Cal c2=new Cal(100,200);//생성자함수 매개 변수가 2개 라서 값 2개 입력가능 
		Cal c3=new Cal(100.5f,200);//다형성:형식에 맞는 생성자를  찾아서 수행한다 n3실수형으로 간다
		Cal c4=new Cal(200,100.7f);
		Cal c5=new Cal(200.5f,100.7f);
	}

}

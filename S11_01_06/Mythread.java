package S11_01_06;

public class Mythread extends Thread{
	char[]c;
	public void run() {
		System.out.println("run starts");
		for(int i=0;i<=10;i++){
			System.out.println(i);
			try{}catch(Exception e){
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("run method ends");
			}
		}
	}
	

}


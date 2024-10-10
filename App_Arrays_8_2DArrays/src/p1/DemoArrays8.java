package p1;
import java.util.*;
	public class DemoArrays8 {
		@SuppressWarnings("removal")
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			try(s;){
				Integer arr[][] = new Integer[3][3];
				System.out.println("Enter 3X3 Matrix...");
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						arr[i][j] = new Integer(s.nextInt());
					}//InnerLoop(cols)
				}//OuterLoop(rows)
				System.out.println("=====display 3X3 Matrix=====");
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						System.out.print(arr[i][j].toString()+" ");
					}//InnerLoop(cols)
					System.out.println();
				}//OuterLoop(rows)

				System.out.println("======display 3X3 Matrix using Extended-for====");
						for(Integer a[] : arr)
						{
							for(Integer k : a)
							{
								System.out.print(k.toString()+" ");
							}//InnerLoop(cols)
							System.out.println();
						}//OuterLoop(rows)
						System.out.println("======display 3X3 Matrix using Spliterator<T>====");
						Spliterator<Integer[]> sp1 = Arrays.spliterator(arr);
						sp1.forEachRemaining((p)->
						{
							Spliterator<Integer> sp2 = Arrays.spliterator(p);
							sp2.forEachRemaining((q)->
							{
								System.out.print(q.toString()+" ");
							});
							System.out.println();
						});
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
}
package interfacesMain;
import java.io.*;
import interfaces.FixedQueue;
import interfaces.CircularQueue;
import interfaces.DynQueue;
import interfaces.CircularQueue1;

public class QueuesMain {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		FixedQueue fq = new FixedQueue(10);
		CircularQueue cq = new CircularQueue(10);
		DynQueue dq = new DynQueue(5);
		
		char ch;
		interfaces.ICharQ iq;
		
		// putting something in FixedQueue
		iq = fq;
		for(int i = 0; i < 10; i++) {
			iq.put((char) ('A' + i));
		}
		
		// getting elements from FixedQueue
		pw.print("FixedQueue: ");
		for(int i = 0; i < fq.getLength(); i++) {
			pw.print(iq.get());
			pw.flush();
		}
		
		iq = dq;
		
		//putting into DynQueue
		for(int i = 0; i < 10; i++) {
			iq.put((char) ('Z' - i));
		}
		
		pw.print("\nDynamicQueue: ");
		for(int i = 0; i < dq.getLength(); i++) {
			pw.print(iq.get());
			pw.flush();
		}
		
		iq = cq;
		
		pw.print("\nCircularQueue: ");
		pw.flush();
		
		//putting into CircularQueue
		for(int i = 0; i < 10; i++) {
			iq.put((char) ('A' + i));
		}
		
		for(int i = 0; i < 10; i++) {
			ch = iq.get();
			System.out.print(ch);
		}
		
		pw.print("\nCircularQueueReuse: ");
		pw.flush();
		
		for(int i = 10; i < 20; i++) {
			iq.put((char) ('A' + i));
		}
		
		for(int i = 0; i < 10; i++) {
			ch = iq.get();
			System.out.print(ch);
		}
		
		pw.print("\nWithSaving: ");
		pw.flush();
		for(int i = 0; i < 20; i++) {
			iq.put((char) ('A' + i));
			ch = iq.get();
			System.out.print(ch);
		}
		
		pw.print("\nResetFixedQueue: ");
		pw.flush();
		
		fq.reset();
		for(int i = 0; i < fq.getLength(); i++) {
			ch = fq.get();
			pw.print(ch);
			pw.flush();
		}
		
		pw.print("\nResetDynQueue: ");
		pw.flush();
		
		dq.reset();
		for(int i = 0; i < dq.getLength(); i++) {
			ch = dq.get();
			pw.print(ch);
			pw.flush();
		}
	}
}
			
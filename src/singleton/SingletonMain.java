package singleton;

public class SingletonMain {

	public static void main(String[] args) {
		EagerInitialization eagerInitialization = EagerInitialization.getInstance();

		System.out.println(eagerInitialization.getMessage());

		StaticBlockInitialization staticBlockInitialization = StaticBlockInitialization.getInstance();

		System.out.println(staticBlockInitialization.getMessage());

		LazyInitilization lazyInitilization = LazyInitilization.getInstance();

		System.out.println(lazyInitilization.getMessage());

		ThreadSafeInitilization threadSafeInitilization = ThreadSafeInitilization.getInstance();

		System.out.println(threadSafeInitilization.getMessage());

		DoubleCheckInitilization doubleCheckInitilization = DoubleCheckInitilization.getInstance();

		System.out.println(doubleCheckInitilization.getMessage());
		
		BillPughInitilization billPughInitilization = BillPughInitilization.getInstance();

		System.out.println(billPughInitilization.getMessage());
	}

}

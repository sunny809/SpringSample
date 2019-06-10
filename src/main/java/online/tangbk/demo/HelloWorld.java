package online.tangbk.demo;

public class HelloWorld {

	public HelloWorld() {

	}

	public HelloWorld(SomeOtherBean someOtherbean) {
		someOtherbean.execute();
	}

	public SomeOtherBean getSomeOtherBean() {
		return someOtherBean;
	}

	public void setSomeOtherBean(SomeOtherBean someOtherBean) {
		this.someOtherBean = someOtherBean;
	}

	public SomeOtherBean someOtherBean;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HelloWorld other = (HelloWorld) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HelloWorld [name=" + name + "]";
	}

	public void printHello() {

		someOtherBean.execute();
		System.out.println("Hello !" + name);
	}

}

class Onecls
{
	private Onecls()
    {
		System.out.println("Hii");
	}
	private static Onecls obj;
	public static Onecls get()
	{
		if(obj==null)
		{
			obj = new Onecls();
		}
		return obj;
	}
}
class hllo
{
    public static void main(String[] args) {
		Onecls o = Onecls.get();
		// Onecls p = Onecls.get();
	}
}
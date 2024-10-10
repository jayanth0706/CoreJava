package p1;
public class EmpolyeeDetails 
{
	String eId,eName,eDesg;
	float bSal,hra,da;
	
	public float m1(float bSal) 
	{
        float res1 = 0.93f*bSal; // Adjusted calculation (assuming this was intended)
        this.bSal = res1; // Store the result in the class attribute
        return res1; // Returning the result as a float
    }
	
	public float m2(float bSal)
	{
		float res2 = 0.63f*bSal;
		this.bSal = res2;
		return res2;
	}
	
	public EmpolyeeDetails(String eId,String eName,String eDesg,float bSal)
	{
		this.eId = eId;
		this.eName = eName;
		this.eDesg = eDesg;
		this.bSal = bSal;
		this.hra = m1(bSal);
		this.da = m2(bSal);	
	}
	
	@Override
	public String toString()
	{

	return eId+"\t"+eName+"\t"+eDesg+"\t"+bSal+"\t"+hra+"\t"+da;
	}
}

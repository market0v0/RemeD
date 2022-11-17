import javax.persistence.*;


@Entity
public class LaboratoryTestEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int labtestId;
	
	
	private String labtestType;
	private Date labtestDate;
	private String labtestStatus;
	
	
	
	
	
}
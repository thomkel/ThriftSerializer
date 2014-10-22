package edu.uchicago.mpcs53013.faceSpace;
import java.io.File;

public class FaceSpaceSerialization {

	public static void main(String[] args) {
		ThriftWriter thriftOut = new ThriftWriter(new File("/tmp/faceSpaceThrift.out"));
		try {
			// Open writer
			thriftOut.open();
			
			// create Data
			PersonPropertyValue personPropertyValue = new PersonPropertyValue();
			personPropertyValue.setEmail_address("jimmyj@gmail.com");			
			
			PersonProperty personProperty = new PersonProperty();
			personProperty.setUsername("jimmyj");
			personProperty.setProperty(personPropertyValue);
			
			Pedigree pedigree = new Pedigree();
			pedigree.setTrue_as_of_secs(999999999);
			
			DataUnit dataUnit1 = new DataUnit();
			dataUnit1.setPerson_property(personProperty);
			
			Data data = new Data();
			data.setPedigree(pedigree);
			data.setDataunit(dataUnit1);
			
			// create Data 2
			PersonID personID1 = new PersonID();
			personID1.setUser_id(6555);
			
			PersonID personID2 = new PersonID();
			personID2.setUser_id(7999);
			
			RelationshipEdge relationshipEdge = new RelationshipEdge();
			relationshipEdge.setId1(personID1);
			relationshipEdge.setId2(personID2);
			
			DataUnit dataUnit2 = new DataUnit();
			dataUnit2.setRelationship_edge(relationshipEdge);
			
			Pedigree pedigree2 = new Pedigree();
			pedigree2.setTrue_as_of_secs(88888888);
			
			Data data2 = new Data();
			data2.setPedigree(pedigree2);
			data2.setDataunit(dataUnit2);		
			
			thriftOut.write(data);
			thriftOut.write(data2);			
			// Close the writer
			thriftOut.close();
		} catch (Exception e) {
			
		}
	}

}

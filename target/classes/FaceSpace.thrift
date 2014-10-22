namespace java edu.uchicago.mpcs53013.faceSpace

union PersonID {
	1: i64 user_id;
}
enum GenderType {
        MALE = 1;
        FEMALE = 2;
}
struct Location {
        1: required string city;
        2: optional string state;
        3: required string country;
}
struct BirthDate {
        1: required i16 birthDay;
        2: required i16 birthMonth;
        3: required i16 birthYear;
}
union PersonPropertyValue {
        1: GenderType gender;
        2: Location location;
        3: BirthDate birthdate;
        4: string email_address;
        5: string full_name;
}
struct PersonProperty {
	1: required string username;
	2: required PersonPropertyValue property;
}
struct RelationshipEdge {
	1: required PersonID id1;
	2: required PersonID id2;
}
union DataUnit {
	1: PersonProperty person_property;
	2: RelationshipEdge relationship_edge;
}
struct Pedigree {
	1: required i32 true_as_of_secs;
}
struct Data {
	1: required Pedigree pedigree;
	2: required DataUnit dataunit;
}

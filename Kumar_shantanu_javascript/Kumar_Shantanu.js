//use of function
 function Employee(fname,lname,ages,add)
{
	this.firstname=fname;
	this.lastname=lname;
	this.age=ages;
	this.address=add;
};

//use of prototype
Employee.prototype.employeepersonalinfo=function()
{
console.log("First Name " +  this.firstname);
console.log("Last Name " + this.lastname);

console.log("Age " + this.age);
console.log("Address " + this.address);
}
var personal1 = new Employee("kumar","shantanu",21,"patna");
var personal2 = new Employee("Layeeq","ahmeed",21,"banglaore");
var personal3 = new Employee("kumar","rajat",21,"delhi");
personal1.employeepersonalinfo();

function employeecompanydetail(id,design,mail,no)
{
       this.employeeid=id;
       this.designation=design;
	this.email=mail;
	this.number=no;
};

employeecompanydetail.prototype.info=function()
{
console.log("Employee Id " + this.employeeid);
console.log("Designation " + this.designation);
console.log("Email " + this.email);
console.log("Number " + this.number);
};
var personcompanydetail1=new employeecompanydetail(5324,"software developer","kumar@accoliteindia.com",9606214470);
var personcompanydetail2=new employeecompanydetail(5325,"software developer","layeeq@accoliteindia.com",9806214470);
var personcompanydetail3=new employeecompanydetail(5326,"software developer","rajat@accoliteindia.com",8606214470);

//use assign method
var employeedetail1=Object.assign(personal1,personcompanydetail1);
var employeedetail2=Object.assign(personal2,personcompanydetail2);
var employeedetail3=Object.assign(personal3,personcompanydetail3);
console.log( employeedetail1);
var person= personcompanydetail1.info;

//use of call
person.call(personcompanydetail1);

var manager= [];
var hr= [];

//push,unshift
//use of IIFE
(function(){
	manager.push(employeedetail1);
manager.unshift(employeedetail2);
hr.push(employeedetail3);
})();

var departmentinfo=function(item){
	console.log(item);
};

//use of forEach
manager.forEach(departmentinfo);

//__proto__ to add propery 
personcompanydetail1.__proto__.salary="20000";
personcompanydetail1.info();
console.log("Salary " +personcompanydetail1.salary )

//use of delete
delete personcompanydetail1.age;
console.log(personcompanydetail1);



function validate(frm){
		let name=frm.pname.value;
			let age=frm.page.value;
				let mobile=frm.mobile.value;
					let flag=true;
					
				document.getElementById("pnameerror").innerHTML = "";
				document.getElementById("pageerror").innerHTML = "";
				document.getElementById("mobileerror").innerHTML = "";
				
				if(name=="")
					{
						flag=false;
						document.getElementById("pnameerror").innerHTML="name must not be empty";
						frm.pname.focus();
					}
				
				if(age=="")
					{
						flag=false;
						document.getElementById("pageerror").innerHTML="age must not be empty";
						frm.page.focus();
					}
				
				else if(isNaN(age))
					{
						flag=false;
						document.getElementById("pageerror").innerHTML="age must be numeric";
						frm.page.focus();
					}
				
				else if(age < 0 || age > 100)
					{
						flag = false;
						document.getElementById("pageerror").innerHTML="age must be between 0 and 100";
						frm.page.focus();
					}
				
				if(mobile=="")
					{
						flag=false;
						document.getElementById("mobileerror").innerHTML="mobile must not be empty";
						frm.mobile.focus();
					}
				
				else if(mobile.length < 10 || mobile.length > 10)
					{
						flag=false;
						document.getElementById("mobileerror").innerHTML="mobile number must exactly 10 digit";
						frm.mobile.focus();
					}
				
				frm.validateflag.value = "true";
				return flag;
	}
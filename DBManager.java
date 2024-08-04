//import java.beans.Statement;
import java.sql.*;
import java.util.*;
 


public class DBManager {
   private static Connection con;
   static Statement st=null;
          private static ResultSet result;
           
      
   public static int addFaculty(String Fac_name,String Remarks) throws Exception{
        String query = "Insert into Faculty(Fac_name, Remarks) values ('"+Fac_name+"','"+Remarks+"')";
        System.out.println(query);
     

        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if (st!=null) {
                st.close();
            }
        }
   }

   public static int addDepartment(int Fac_id,String Dept_name,String Remarks) throws Exception{
        String query = "Insert into Department(Fac_id,Dept_name,Remarks) values ("+Fac_id+",'"+Dept_name+"','"+Remarks+"')";
        System.out.println(query);
        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if (st!=null) {
                st.close();
            }
        }
   }

   public static int addProgram(int Dept_id, String Prog_name,int Duration_in_semester,String Remarks)throws Exception{
        String query = "Insert into Program(Dept_id,Prog_name,Duration_in_semester,Remarks) values ("+Dept_id+",'"+Prog_name+"',"+Duration_in_semester+",'"+Remarks+"')";
        System.out.println(query);
        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if (st!=null) {
                st.close();
            }
        }
   } 

   public static int addBatch(int Prog_id,int Batch_year,String Shift,String Group_desc,String Remarks)throws Exception{
        String query = "Insert into Batch(Prog_id,Batch_year,Shift,Group_desc,Remarks) values ("+Prog_id+","+Batch_year+",'"+Shift+"','"+Group_desc+"','"+Remarks+"')";
        System.out.println(query);
        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if (st!=null) {
                st.close();
            }
        }
   }

   public static int addStudent(int Batch_id,String Std_name,String Father_name,String Surname,String Gender,String Roll_no,String Remarks)throws Exception{
        String query = "Insert into Student(Batch_id,Std_name,Father_name,Surname,Gender,Roll_no,Remarks) values ("+Batch_id+",'"+Std_name+"','"+Father_name+"','"+Surname+"','"+Gender+"','"+Roll_no+"','"+Remarks+"')";
        System.out.println(query);
        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if (st!=null) {
                st.close();
            }
        }
   }

   public static int UpdateFaculty(int Fac_id,String Fac_Name,String Remarks) throws Exception{
        String query ="Update Faculty SET Fac_name = '"+Fac_Name+"' , Remarks = '"+Remarks+"' where Fac_id = "+Fac_id;
        System.out.println(query);
        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if (st!=null) {
                st.close();
            }
        }

        
    }

    public static int UpdateDepartment(int Dept_id,String Dept_name,String Remarks)throws Exception{
        String query = "Update Department SET Dept_name = '"+Dept_name+"', Dept_name = '"+Dept_name+"', Remarks = '"+Remarks+"' where Dept_id = "+Dept_id;
        System.out.println(query);
        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if (st!=null) {
                st.close();
            }
        }

        
    }

    public static int UpdateProgram(int Prog_id,String Prog_name,int Duration_in_semester,String Remarks)throws Exception{
        String query = "Update Program SET Prog_name = '"+Prog_name+"',Duration_in_semester = "+Duration_in_semester+" ,Remarks = '"+Remarks+"' where Prog_id = "+Prog_id;
        System.out.println(query);
        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if (st!=null) {
                st.close();
            }
        }
    }

    public static int UpdateBatch(int Batch_id,int Batch_year,String Shift,String Group_desc,String Remarks)throws Exception{
        String query = "Update Batch SET Batch_year = "+Batch_year+",'"+Shift+"', Group_desc = '"+Group_desc+"', Remarks = '"+Remarks+"' where Batch_id = "+Batch_id;
        System.out.println(query);
        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if (st!=null) {
                st.close();
            }
        }
    }

    public static int UpdateStudent(int Std_id,String Std_name,String Father_name,String Surname,String Gender,String Roll_no, String Remarks)throws Exception{
        String query = "Update Student SET Std_name = '"+Std_name+"', Father_name = '"+Father_name+"', Surname = '"+Surname+"', Gender = '"+Gender+"', Roll_no = '"+Roll_no+"', Remarks = '"+Remarks+"' where Std_id = "+Std_id;
        System.out.println(query);
        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if (st!=null) {
                st.close();
            }
        }
    }
    

    public static int deleteFaculty(int facId) throws Exception{
        String query = "DELETE from Faculty where Fac_id = "+facId;
        System.out.println(query);
        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if (st!=null) {
                st.close();
            }
        }
        

     }


    

    public static int deleteDepartment(int deptId) throws Exception{
        String query = "DELETE from Department where Dept_id = "+deptId;
        System.out.println(query);
        

        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;

        }finally{
            if (st!=null) {
                st.close();
            }
        }
    }

    public static int deleteProgram(int Prog_id) throws Exception{
        String query = "DELETE from Program where Prog_id = "+Prog_id;
        System.out.println(query);
       
        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if (st!=null) {
                st.close();
            }
        }
    }

    public static int deleteBatch(int Batch_id) throws Exception{
        String query = "DELETE from Batch where Batch_id = "+Batch_id;
        System.out.println(query);
       
        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;

        }finally{
            if (st!=null) {
                st.close();
            }
        }

    }

    public static int deleteStudent(int Std_id) throws Exception{
        String query = "DELETE from Student where Std_id = "+Std_id;
        System.out.println(query);
        try{
            st=con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if (st!=null) {
                st.close();
            }
        }

    }

    public static Vector getFaculty()throws Exception{
        String query = "Select Fac_id,Fac_name,Remarks from Faculty";
        System.out.println(query);
        try{
            st = con.createStatement();
            result = st.executeQuery(query);
            
            Vector<FacultyBean> v = new Vector<FacultyBean>();

            while (result.next()) {
                int FacId=result.getInt("Fac_id");
                String facName = result.getString("Fac_name");
                String remarks = result.getString("Remarks");

                FacultyBean bean = new FacultyBean();

                bean.setFacId(FacId);
                bean.setFacName(facName);
                bean.setRemarks(remarks);
                v.add(bean);
                
            }
            return v;
        }finally{
            if (result!=null) {
                result.close();
            }
            if (st!=null) {
                st.close();
            }
        }
    }

    public static Vector getDepartment(int Fac_id)throws Exception{
        String query = "Select dept_id ,fac_id,Dept_name,Remarks from Department";
        System.out.println(query);
        try{
            st = con.createStatement();
            result = st.executeQuery(query);
            Vector v = new Vector();
            while (result.next()) {
                int deptId = result.getInt("dept_id");
                int FacId = result.getInt("fac_id");
                String deptName = result.getString("Dept_name");
                String remarks = result.getString("Remarks");

                DeptBean bean = new DeptBean();

                bean.setDeptId(deptId);
                bean.setFacId(FacId);
                bean.setDeptName(deptName);
                bean.setRemarks(remarks);
                v.add(bean);
            }
            return v;
        }finally{
            if (result!=null) {
                result.close();
            }
            if (st!=null) {
                st.close();
            }
        }
        
        
    }

    public static Vector getProgram(int Dept_id)throws Exception{
        String query = "Select Prog_id,Dept_id,Prog_name,Duration_in_semester,Remarks from Program";
        System.out.println(query);
        try{
            st=con.createStatement();
            result = st.executeQuery(query);
            Vector v = new Vector();
            while (result.next()) {
                int ProgId = result.getInt("Prog_id");
                int DeptId = result.getInt("Dept_id");
                String ProgName = result.getString("Prog_name");
                int DurationInSemester = result.getInt("Duration_in_semester");
                String Remarks = result.getString("Remarks");

                ProgramBean bean = new ProgramBean();

                bean.setDeptid(DeptId);
                bean.setProgid(ProgId);
                bean.setProgname(ProgName);
                bean.setDurationInSemester(DurationInSemester);
                bean.setRemarks(Remarks);
                v.add(bean);

            }
            return v;
        }finally{
            if (result!=null) {
                result.close();
            }
            if (st!=null) {
                st.close();
            }
        }
    }

    public static Vector getBatch(int Prog_id)throws Exception{
        String query = "Select batch_id,prog_id,batch_year,shift,group_desc,remarks from Batch";
        System.out.println(query);
        try{
            st=con.createStatement();
            result = st.executeQuery(query);
            Vector v = new Vector();
            while (result.next()) {
                int batchId = result.getInt("batch_id");
                int progId = result.getInt("prog_id");
                int batchYear = result.getInt("batch_year");
                String shift = result.getString("shift");
                String groupDesc = result.getString("group_desc");
                String remarks = result.getString("remarks");

                BatchBean bean = new BatchBean();

                bean.setBatchId(batchId);
                bean.setProgid(progId);
                bean.setBatchYear(batchYear);
                bean.setShift(shift);
                bean.setGroupDesc(groupDesc);
                bean.setRemarks(remarks);
                v.add(bean);


            }
            return v;
            
        }finally{
                if (result!=null) {
                    result.close();
                }
                if (st!=null) {
                    st.close();
                }
            }
        
    }

    public static Vector getStudent(int batchId)throws Exception{
        String query = "Select Std_id,batch_id,std_name,father_name,surname,gender,roll_no,remarks from Student";
        System.out.println(query);
        try{
            st=con.createStatement();
            result = st.executeQuery(query);
            Vector v = new Vector();
            while (result.next()) {
                int stdId = result.getInt("std_id");
                int Batch_id = result.getInt("batch_id");
                String stdName = result.getString("std_name");
                String fatherName = result.getString("father_name");
                String surname = result.getString("surname");
                String gender = result.getString("gender");
                String rollNo = result.getString("roll_no");
                String remarks = result.getString("remarks");

                StudentBean bean = new StudentBean();

                bean.setStudentId(stdId);
                bean.setBatchId(Batch_id);
                bean.setStudentName(stdName);
                bean.setFatherName(fatherName);
                bean.setSurname(surname);
                bean.setGender(gender);
                bean.setRollNo(rollNo);
                bean.setRemarks(remarks);

                v.add(bean);



            }
            return v;
        }finally{
            if (result!=null) {
                result.close();
            }
            if (st!=null) {
                st.close();
            }
        }
    }


    
}


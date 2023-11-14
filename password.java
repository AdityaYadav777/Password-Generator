
public class password {

    public static void main(String[] args) {
       
     char arr[]=new char[11];
        String pass="!!677qwertyufvbn+-@!jbdoihboeisebgioiwh7t98y3487y902479y27trgwu8ui5hhhe5rjbduvioljfnbh8ih}{@#33r3rr4wwweffgg4wqasbrevwsgrhx}";
        for(int i=0;i<10;i++){
             int a=(int) ((Math.random()*Math.random()*Math.random())*27);
             arr[i]=pass.charAt(a);
            }

            System.out.println();
            for(int i=0;i<arr.length;i++){
                System.out.print(""+arr[i]);
            }
            System.out.println();
    }
}

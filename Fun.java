import java.util.*;
import java.io.*;
public class Fun{
    public static void main(String [] args){
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String check = sc.nextLine();
        int lenght = check.length();
        String ch = check.toUpperCase();
        for(int i=0;i<lenght;i++) {
            c = ch.charAt(i);
            if(c =='A')
                System.out.print("  ******  \n  *    *  \n  ******  \n  *    *  \n  *    * \n\n");
            if(c == 'B')
                System.out.print("  ******  \n  *    *  \n  *****   \n  *    *  \n  ******  \n\n");
            if(c == 'C')
                System.out.println("  ******   \n  *  \n  *       \n  *       \n  ******  \n\n");
            if(c == 'D')
                System.out.println("  *****   \n  *    *  \n  *    *  \n  *    *  \n  *****   \n\n");
            if(c == 'E')
                System.out.println("  ******  \n  *       \n  *****   \n  *       \n  ******  \n\n");
            if(c == 'F')
                System.out.println("  ******  \n  *       \n  *****   \n  *       \n  *       \n\n");
            if(c == 'G')
                System.out.println("  *******  \n  *       \n  *   ***   \n  *     *  \n  *******  \n\n");
            if(c == 'H')
                System.out.println("  *    *  \n  *    *  \n  ******  \n  *    *  \n  *    * \n\n");
            if(c == 'I')
                System.out.println("    **    \n    **    \n    **    \n    **    \n    **        \n\n");
            if(c == 'J')
                System.out.println("  ******  \n    **    \n    **    \n  * **  \n  ****    \n\n");
            if(c == 'K')
                System.out.println("  *   *   \n  *  *    \n  **      \n  *  *    \n  *   *   \n\n");
            if(c == 'L')
                System.out.println("  *      \n  *                  \n  *       \n  *       \n  ******  \n\n");
            if(c == 'M')
                System.out.println("  *    *   \n  **  **  \n  * ** *  \n  *    *   \n  *    *  \n\n");
            if(c == 'N')
                System.out.println("  *    *  \n  **   *  \n  * *  *  \n  *  * *  \n  *   **  \n\n");
            if(c == '0')
                System.out.println("  ******   \n  *    *  \n  *    *  \n  *    *  \n  ******  \n\n");
            if(c == 'P')
                System.out.println("  ******  \n  *    *  \n  ******  \n  *       \n  *       \n\n");
            if(c == 'Q')
                System.out.println("  ******  \n  *    *  \n  * *  *  \n  *  * *  \n  ******   \n       *            \n\n");
            if(c == 'R')
                System.out.println("  ******  \n  *    * \n  * **   \n  *   *   \n  *    *  \n\n");
            if(c == 'S')
                System.out.println("  ******    \n  *      \n  ******  \n       *  \n  ******   \n\n");
            if(c == 'T')
                System.out.println("  ******  \n    **     \n    **    \n    **    \n    **     \n\n");
            if(c == 'U')
                System.out.println("  *    *  \n  *    *   \n  *    *    \n  *    *    \n  ******   \n\n");
            if(c == 'V')
                System.out.println("  *    *  \n  *    *  \n  *    *  \n   *  *   \n    **    \n\n");
            if(c == 'W')
                System.out.println();
            if(c == 'X')
                System.out.println("  *    *  \n   *  *   \n    **    \n   *  *   \n  *    *  \n\n");
            if(c == 'Y')
                System.out.println("  *    *  \n   *  *   \n    **    \n    **    \n    **    \n\n");
            if(c == 'Z')
                System.out.println("   ******    \n       *  \n     *    \n   *     \n  ******  \n\n");
        }        
    }
}


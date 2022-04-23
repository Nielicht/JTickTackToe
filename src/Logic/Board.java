package Logic;

public class Board
{
    // Clowny attributes
    private char[][] matriz;
    private int activePlayer = 0;
    private int refPos[] = new int[2];
    
    public Board()
    {
        matriz = new char[3][3];
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                matriz[i][j] = ' ';
            }
        }
    }
    
    public void move(int[] pos)
    {
        char valueChar = ' ';
        
        switch (activePlayer)
        {
            
            case 0:
                valueChar = 'O';
                break;
                
            case 1:
                valueChar = 'X';
                break;
                
            default:
                System.out.println("You lose your turn");
        
        }
        
        matriz[pos[1]][pos[0]] = valueChar;
        
        refPos = pos;
        activePlayer = (activePlayer + 1) % 2;
    }
    
    public void printBoard()
    {
        //  Example:
        //  [ - O X ]
        //  [ - X - ] 
        //  [ - O - ]
        
        for (int i = 0; i < matriz.length; i++)
        {
            System.out.println("[ " + matriz[i][0] + "  " + matriz[i][1] + "  " + matriz[i][2] + " ]");
        }
    }
    
    public boolean logic() 
    {
        //  Example:
        //  [ O O X ]
        //  [ O X X ] 
        //  [ X O X ]
        
        // Needed logic thingies
        boolean results = false;
        int stakes = 0;
        char reference;
        
        if (activePlayer == 1) reference = 'O';
        
        else reference = 'X';
        
        // Caso horizontal
        for (int i = 0; i < matriz.length; i++)
        {
            if (matriz[refPos[1]][i] == reference) stakes++;
        }
        
        if (stakes >= 3) results = true;
        
        else stakes = 0;
        
        // Caso vertical
        for (int i = 0; i < matriz.length; i++)
        {
            if (matriz[i][refPos[0]] == reference) stakes++;
        }
        
        if (stakes >= 3) results = true;
        
        else stakes = 0;
        
        // Caso diagonal
        for (int i = 0; i < matriz.length; i++)
        {
            if (matriz[i][i] == reference) stakes++;
        }
        
        if (stakes >= 3) results = true;
       
        else stakes = 0;
        
        for (int i = 2; i > -1; i--)
        {
            if (matriz[i][2-i] == reference) stakes++;
        }
        
        if (stakes >= 3) results = true;
        
        return results;
    }
}

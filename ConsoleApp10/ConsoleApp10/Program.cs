using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ConsoleApp10
{
    internal class Program
    {
        class DialogWindow { 
        
        static void Main()
        {
                MessageBox.Show("предупреждение екомпьютерный вирус", "окно с названием",
                    MessageBoxButtons.YesNoCancel,
                    MessageBoxIcon.Warning);

        }
        
        
        }
        
    }
}

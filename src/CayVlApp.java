import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;


import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;

public class CayVlApp {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(186, 83, 75, 25);
		btnNewButton.setText("New Button");
		
		Label lblHahahaidvAysgflask = new Label(shell, SWT.NONE);
		lblHahahaidvAysgflask.setBounds(63, 27, 197, 15);
		lblHahahaidvAysgflask.setText("HAHAHAidv aysgflask");
		
		Button btnBtn = new Button(shell, SWT.NONE);
		btnBtn.setBounds(43, 84, 75, 25);
		btnBtn.setText("Btn 1");
		
		Button btnBtn_1 = new Button(shell, SWT.NONE);
		btnBtn_1.setBounds(43, 129, 75, 25);
		btnBtn_1.setText("Btn 2");
//		
//		Composite composite = new Composite(this, SWT.NONE);
//		composite.setBounds(191, 71, 236, 179);
		Composite composite = new ContentComposite(shell,SWT.NONE );
		composite.setBounds(192, 60, 472, 294);
//		Label lblHahah = new Label(composite, SWT.NONE);
//		lblHahah.setBounds(10, 56, 55, 15);
//		lblHahah.setText("Hahah");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}

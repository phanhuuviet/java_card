package main;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

public class MainApp extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public MainApp(Composite parent, int style) {
		super(parent, style);
		
		Label lblHahahaidvAysgflask = new Label(this, SWT.NONE);
		lblHahahaidvAysgflask.setBounds(63, 27, 197, 15);
		lblHahahaidvAysgflask.setText("HAHAHAidv aysgflask");
		
		Button btnBtn = new Button(this, SWT.NONE);
		btnBtn.setBounds(43, 84, 75, 25);
		btnBtn.setText("Btn 1");
		
		Button btnBtn_1 = new Button(this, SWT.NONE);
		btnBtn_1.setBounds(43, 129, 75, 25);
		btnBtn_1.setText("Btn 2");
//		
//		Composite composite = new Composite(this, SWT.NONE);
//		composite.setBounds(191, 71, 236, 179);
		Composite composite = new ContentComposite(this,SWT.NONE );
		composite.setBounds(192, 60, 472, 294);
//		Label lblHahah = new Label(composite, SWT.NONE);
//		lblHahah.setBounds(10, 56, 55, 15);
//		lblHahah.setText("Hahah");

	}
	 
	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}

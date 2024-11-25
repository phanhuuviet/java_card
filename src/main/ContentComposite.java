package main;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;

public class ContentComposite extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ContentComposite(Composite parent, int style) {
		super(parent, style);
		
		Button btnAsdjhailud = new Button(this, SWT.NONE);
		btnAsdjhailud.setBounds(30, 51, 75, 25);
		btnAsdjhailud.setText("asdjhailud");
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setBounds(185, 177, 55, 15);
		lblNewLabel.setText("New Label");
		
		Label lblAsdasd = new Label(this, SWT.NONE);
		lblAsdasd.setBounds(228, 98, 55, 15);
		lblAsdasd.setText("asdasd ");
		
		Label lblAsdsaDsaf = new Label(this, SWT.NONE);
		lblAsdsaDsaf.setBounds(323, 177, 55, 15);
		lblAsdsaDsaf.setText("asdsa dsaf");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}

package main;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.DateTime;

public class PopupEditInfo extends Composite {
	private LocalResourceManager localResourceManager;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public PopupEditInfo(Composite parent, int style) {
		super(parent, style);
		createResourceManager();
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 15, SWT.NORMAL)));
		lblNewLabel.setBounds(190, 37, 206, 57);
		lblNewLabel.setText("Chỉnh sửa thông tin");
		
		Label lblNewLabel_1 = new Label(this, SWT.NONE);
		lblNewLabel_1.setBounds(37, 108, 55, 15);
		lblNewLabel_1.setText("Họ tên");
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(99, 105, 148, 21);
		
		Label lblNewLabel_1_1 = new Label(this, SWT.NONE);
		lblNewLabel_1_1.setText("Quê quán");
		lblNewLabel_1_1.setBounds(322, 146, 55, 15);
		
		text_1 = new Text(this, SWT.BORDER);
		text_1.setBounds(384, 143, 148, 21);
		
		Label lblNewLabel_1_2 = new Label(this, SWT.NONE);
		lblNewLabel_1_2.setText("Giới tính");
		lblNewLabel_1_2.setBounds(322, 108, 55, 15);
		
		Combo combo = new Combo(this, SWT.NONE);
		combo.setItems(new String[] {"Nam", "Nữ"});
		combo.setBounds(383, 103, 149, 23);
		
		Label lblNewLabel_1_3 = new Label(this, SWT.NONE);
		lblNewLabel_1_3.setText("Họ tên");
		lblNewLabel_1_3.setBounds(37, 146, 55, 15);
		
		DateTime dateTime = new DateTime(this, SWT.BORDER);
		dateTime.setBounds(99, 140, 148, 24);
		
		Label lblNewLabel_1_1_1 = new Label(this, SWT.NONE);
		lblNewLabel_1_1_1.setText("Địa chỉ thường trú");
		lblNewLabel_1_1_1.setBounds(37, 181, 55, 15);
		
		text_2 = new Text(this, SWT.BORDER);
		text_2.setBounds(99, 178, 148, 21);
		
		Label lblNewLabel_1_1_1_1 = new Label(this, SWT.NONE);
		lblNewLabel_1_1_1_1.setText("Quốc tịch");
		lblNewLabel_1_1_1_1.setBounds(322, 184, 55, 15);
		
		text_3 = new Text(this, SWT.BORDER);
		text_3.setBounds(384, 181, 148, 21);
		
		Label lblNewLabel_1_1_1_1_1 = new Label(this, SWT.NONE);
		lblNewLabel_1_1_1_1_1.setText("Dân tộc");
		lblNewLabel_1_1_1_1_1.setBounds(37, 219, 55, 15);
		
		text_4 = new Text(this, SWT.BORDER);
		text_4.setBounds(99, 216, 148, 21);
		
		Label lblNewLabel_1_1_1_1_1_1 = new Label(this, SWT.NONE);
		lblNewLabel_1_1_1_1_1_1.setText("Dân tộc");
		lblNewLabel_1_1_1_1_1_1.setBounds(322, 222, 55, 15);
		
		text_5 = new Text(this, SWT.BORDER);
		text_5.setBounds(384, 219, 148, 21);

	}
	private void createResourceManager() {
		localResourceManager = new LocalResourceManager(JFaceResources.getResources(),this);
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}

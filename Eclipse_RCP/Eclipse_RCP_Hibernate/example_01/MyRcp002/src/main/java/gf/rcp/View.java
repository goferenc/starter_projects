package gf.rcp;

import java.util.*;

import javax.inject.Inject;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.part.ViewPart;

import gf.entities.Employee;
import gf.services.EmployeeService;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.layout.GridData;

public class View extends ViewPart {
	public View() {
	}

	public static final String ID = "MyRcp002.view";

	@Inject
	IWorkbench workbench;

	private TableViewer viewer;

	private EmployeeService employeeService = new EmployeeService();
	private Text employeeNameText;
	private Text employeeAgeText;

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout(SWT.VERTICAL));

		Group group = new Group(parent, SWT.NONE);
		group.setLayout(new GridLayout(2, false));

		Label lblNewLabel_2 = new Label(group, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblNewLabel_2.setText("Create new employee");

		Label nameLabel = new Label(group, SWT.NONE);
		nameLabel.setBounds(0, 0, 55, 15);
		nameLabel.setText("NAME");

		employeeNameText = new Text(group, SWT.BORDER);

		Label ageLabel = new Label(group, SWT.NONE);
		ageLabel.setBounds(0, 0, 55, 15);
		ageLabel.setText("AGE");

		employeeAgeText = new Text(group, SWT.BORDER);
		employeeAgeText.setBounds(0, 0, 76, 21);
		new Label(group, SWT.NONE);
		new Label(group, SWT.NONE);

		Button persistEmployeeDataButton = new Button(group, SWT.NONE);
		persistEmployeeDataButton.setText("Persist Employee data");
		new Label(group, SWT.NONE);

		persistEmployeeDataButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				switch (e.type) {
				case SWT.Selection:
					try {
						Employee employee = new Employee();
						employee.setName(employeeNameText.getText());
						employee.setAge(Integer.parseInt(employeeAgeText.getText()));
						// TODO: handle number problem
						
						employeeService.persist(employee);
						
						viewer.setInput(createInitialDataModel());
					}catch (Exception e2) {
						// TODO: handle exception
					}
					
					break;
				}
			}
		});

		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);

		final Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableViewerColumn colId = new TableViewerColumn(viewer, SWT.NONE);
		colId.getColumn().setWidth(200);
		colId.getColumn().setText("ID");
		colId.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Employee employee = (Employee) element;
				return String.valueOf(employee.getId());
			}
		});

		TableViewerColumn colName = new TableViewerColumn(viewer, SWT.NONE);
		colName.getColumn().setWidth(200);
		colName.getColumn().setText("NAME");
		colName.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Employee employee = (Employee) element;
				return employee.getName();
			}
		});

		TableViewerColumn colAge = new TableViewerColumn(viewer, SWT.NONE);
		colAge.getColumn().setWidth(200);
		colAge.getColumn().setText("AGE");
		colAge.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Employee employee = (Employee) element;
				return String.valueOf(employee.getAge());
			}
		});

		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setInput(createInitialDataModel());
	}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	private List<Employee> createInitialDataModel() {
		return employeeService.findAll();
	}
}
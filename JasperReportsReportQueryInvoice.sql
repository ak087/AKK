SELECT rpt1.*, branch.*, branch.state as branch_state, branch.name as branch_name, branch.code as branch_code from 
(
SELECT rpt.*, itm.uom FROM 
(
SELECT *, cust_invoice_item.remarks as item_remarks, array_to_string(
	ARRAY(
		SELECT serial AS list 
		FROM inv_serial_number_delta 
		WHERE doc_table = 'cust_invoice_item' 
		  AND doc_key = cust_invoice_item.pkid
	),
	', '
) AS serials 
FROM cust_invoice_index 
LEFT JOIN cust_invoice_item 
	ON cust_invoice_index.pkid = cust_invoice_item.invoice_id 
WHERE cust_invoice_index.pkid = $P{INV_PKID}
) AS rpt INNER JOIN inv_item itm ON rpt.item_id = itm.pkid
) AS rpt1 INNER JOIN acc_branch_index branch ON branch.pkid = rpt1.cust_svcctr_id
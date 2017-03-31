package test.com.ctrip.platform.dal.dao.task;

import java.sql.Timestamp;
import java.sql.Types;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.ctrip.platform.dal.dao.UpdatableEntity;
import com.ctrip.platform.dal.dao.annotation.Database;
import com.ctrip.platform.dal.dao.annotation.Type;

@Entity
@Database(name="MySqlSimpleDbTableShard")
@Table(name="dal_client_test")
public class UpdatableClientTestModel extends UpdatableEntity {
	@Id
	@Column(name="id")
	@Type(value=Types.INTEGER)
	private Integer id;
	
	@Column(name="quantity")
	@Type(value=Types.INTEGER)
	private Integer quantity;
	
	@Column(name="dbIndex")
	@Type(value=Types.INTEGER)
	private Integer dbIndex;
	
	@Column(name="tableIndex")
	@Type(value=Types.INTEGER)
	private Integer tableIndex;
	
	@Column(name="type")
	@Type(value=Types.SMALLINT)
	private Short type;
	
	@Column(name="address")
	@Type(value=Types.VARCHAR)
	private String address;
	
	@Column(name="last_changed")
	@Type(value=Types.TIMESTAMP)
	@Version
	private Timestamp lastChanged;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		update("id");
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		update("quantity");
		this.quantity = quantity;
	}

	public Integer getDbIndex() {
		return dbIndex;
	}

	public void setDbIndex(Integer dbIndex) {
		update("dbIndex");
		this.dbIndex = dbIndex;
	}

	public Integer getTableIndex() {
		return tableIndex;
	}

	public void setTableIndex(Integer tableIndex) {
		update("tableIndex");
		this.tableIndex = tableIndex;
	}
	
	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		update("type");
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		update("address");
		this.address = address;
	}

	public Timestamp getLastChanged() {
		return lastChanged;
	}

	public void setLastChanged(Timestamp lastChanged) {
		update("last_changed");
		this.lastChanged = lastChanged;
	}
}
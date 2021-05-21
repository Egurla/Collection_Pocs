package com.setpos;

public class Product {

	int pId;
	String pName;
	public Product(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pId;
		result = prime * result + ((pName == null) ? 0 : pName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (pId != other.pId)
			return false;
		if (pName == null) {
			if (other.pName != null)
				return false;
		} else if (!pName.equals(other.pName))
			return false;
		return true;
	}
}

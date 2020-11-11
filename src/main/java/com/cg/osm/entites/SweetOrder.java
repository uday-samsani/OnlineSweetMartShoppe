package com.cg.osm.entites;

import java.time.LocalDate;
import java.util.Map;

import antlr.collections.List;

public class SweetOrder {
		private Integer sweetOrderId ;
		private User user ;
		private List listItems ;
		private LocalDate createDate ;
		private Map<Product,Long> groupedProducts ;
		
		public SweetOrder(Integer sweetOrderId, User user, List listItems, LocalDate createDate,
				Map<Product, Long> groupedProducts) {
			super();
			this.sweetOrderId = sweetOrderId;
			this.user = user;
			this.listItems = listItems;
			this.createDate = createDate;
			this.groupedProducts = groupedProducts;
		}

		public Integer getSweetOrderId() {
			return sweetOrderId;
		}

		public void setSweetOrderId(Integer sweetOrderId) {
			this.sweetOrderId = sweetOrderId;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public List getListItems() {
			return listItems;
		}

		public void setListItems(List listItems) {
			this.listItems = listItems;
		}

		public LocalDate getCreateDate() {
			return createDate;
		}

		public void setCreateDate(LocalDate createDate) {
			this.createDate = createDate;
		}

		public Map<Product, Long> getGroupedProducts() {
			return groupedProducts;
		}

		public void setGroupedProducts(Map<Product, Long> groupedProducts) {
			this.groupedProducts = groupedProducts;
		}
		
		
		
}

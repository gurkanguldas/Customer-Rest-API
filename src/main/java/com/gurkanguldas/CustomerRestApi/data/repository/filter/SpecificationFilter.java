package com.gurkanguldas.CustomerRestApi.data.repository.filter;

import java.util.Map;

import javax.persistence.criteria.From;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.gurkanguldas.CustomerRestApi.data.dao.IEntity;

/**
 * Performs basic filtering for database entity objects.
 * 
 * @author Gurkan
 *
 * @param <T> specifies that the generic type is an entity object.
 */
public abstract class SpecificationFilter<T extends IEntity> {

	/**
	 * Mapping of filter types with a String types.
	 * 
	 * @param table  the table name to use for the filter.
	 * @param column the column name to use for the filter.
	 * @param value1 value to compare in filter
	 * @param value2 value to compare in filter but only between filter.
	 * @return
	 */
	public abstract Map<String, Specification<T>> mapFilter(String table, String column, Object value1, Object value2);

	/**
	 * Used for the LIKE condition.
	 * 
	 * @param table  the table name to use for the filter.
	 * @param column the column name to use for the filter.
	 * @param value  value to compare in filter
	 * @return
	 */
	protected Specification<T> customerLike(String table, String column, Object value) {
		return (root, query, criteriaBuilder) -> {
			Map<String, From<?, ?>> mapRoot = mapTables(root);
			return criteriaBuilder.like(mapRoot.get(table).get(column), value.toString());
		};
	}

	/**
	 * Used for the IN condition.
	 * 
	 * @param table  the table name to use for the filter.
	 * @param column the column name to use for the filter.
	 * @param value  value to compare in filter
	 * @return
	 */
	protected Specification<T> customerIn(String table, String column, Object value) {
		return (root, query, criteriaBuilder) -> {
			Map<String, From<?, ?>> mapRoot = mapTables(root);
			return mapRoot.get(table).get(column).in(value);
		};
	}

	/**
	 * Used for the BETWEEN condition.
	 * 
	 * @param table  the table name to use for the filter.
	 * @param column the column name to use for the filter.
	 * @param value1 value to compare in filter
	 * @param value2 value to compare in filter
	 * @return
	 */
	protected Specification<T> customerBetween(String table, String column, Object value1, Object value2) {
		return (root, query, criteriaBuilder) -> {
			Map<String, From<?, ?>> mapRoot = mapTables(root);
			return criteriaBuilder.between(mapRoot.get(table).get(column), Double.valueOf(value1.toString()),
					Double.valueOf(value2.toString()));
		};
	}

	/**
	 * Used for the NOT EQUALS condition.
	 * 
	 * @param table  the table name to use for the filter.
	 * @param column the column name to use for the filter.
	 * @param value  value to compare in filter
	 * @return
	 */
	protected Specification<T> customerNotEquals(String table, String column, Object value) {
		return (root, query, criteriaBuilder) -> {
			Map<String, From<?, ?>> mapRoot = mapTables(root);
			return criteriaBuilder.notEqual(mapRoot.get(table).get(column), value);
		};
	}

	/**
	 * Used for the EQUALS condition.
	 * 
	 * @param table  the table name to use for the filter.
	 * @param column the column name to use for the filter.
	 * @param value  value to compare in filter
	 * @return
	 */
	protected Specification<T> customerEquals(String table, String column, Object value) {
		return (root, query, criteriaBuilder) -> {
			Map<String, From<?, ?>> mapRoot = mapTables(root);
			return criteriaBuilder.equal(mapRoot.get(table).get(column), value);
		};
	}

	/**
	 * Used for the GREATER THAN( >= ) condition.
	 * 
	 * @param table  the table name to use for the filter.
	 * @param column the column name to use for the filter.
	 * @param value  value to compare in filter
	 * @return
	 */
	protected Specification<T> customerGreaterThanOrEqualTo(String table, String column, Object value) {
		return (root, query, criteriaBuilder) -> {
			Map<String, From<?, ?>> mapRoot = mapTables(root);
			return criteriaBuilder.greaterThanOrEqualTo(mapRoot.get(table).get(column),
					Double.valueOf(value.toString()));
		};
	}

	/**
	 * Used for the LESS THAN ( <= ) condition.
	 * 
	 * @param table  the table name to use for the filter.
	 * @param column the column name to use for the filter.
	 * @param value  value to compare in filter
	 * @return
	 */
	protected Specification<T> customerLessThanOrEqualTo(String table, String column, Object value) {
		return (root, query, criteriaBuilder) -> {
			Map<String, From<?, ?>> mapRoot = mapTables(root);
			return criteriaBuilder.lessThanOrEqualTo(mapRoot.get(table).get(column), Double.valueOf(value.toString()));
		};
	}

	/**
	 * Used for the JOIN operation.
	 * 
	 * @param root
	 * @return
	 */
	protected abstract Map<String, From<?, ?>> mapTables(Root<?> root);
}

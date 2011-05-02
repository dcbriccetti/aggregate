package org.opendatakit.aggregate.client.filter;

import java.io.Serializable;

import org.opendatakit.aggregate.client.submission.Column;
import org.opendatakit.aggregate.constants.common.FilterOperation;
import org.opendatakit.aggregate.constants.common.RowOrCol;
import org.opendatakit.aggregate.constants.common.Visibility;

public class RowFilter extends Filter implements Serializable {

  /**
   * Id for serialization
   */
  private static final long serialVersionUID = -482917672621588696L;
  private Column column;
  private FilterOperation operation;
  private String input;

  public RowFilter() {
    super();
  }

  // TODO: Kyle I am not sure why RowFilter has keep/remove?
  public RowFilter(Visibility keepRemove, Column column, FilterOperation compare, String inputParam,
      Long ordinal) {
    super(RowOrCol.ROW, ordinal);
    this.operation = compare;
    this.input = inputParam;
    this.column = column;
  }

  /**
   * This constructor should only be used by the server
   * 
   * @param uri
   */
  public RowFilter(String uri) {
    super(uri);
  }

  public Visibility getVisibility() {
    // TODO: Kyle I am not sure why RowFilter has keep/remove?
    return Visibility.KEEP;
  }

  public FilterOperation getOperation() {
    return operation;
  }

  public void setOperation(FilterOperation operation) {
    this.operation = operation;
  }

  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }
  
  public void setColumn(Column column) {
    this.column = column;
  }
  
  public Column getColumn() {
    return this.column;
  }
  
}
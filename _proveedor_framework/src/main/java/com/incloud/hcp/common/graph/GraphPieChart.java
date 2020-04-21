package com.incloud.hcp.common.graph;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class GraphPieChart {

    private GraphDataset[] datasets ;
    private String[] labels;


}

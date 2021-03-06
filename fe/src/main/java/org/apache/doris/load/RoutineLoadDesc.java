// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.


package org.apache.doris.load;

import org.apache.doris.analysis.ColumnSeparator;
import org.apache.doris.analysis.Expr;
import org.apache.doris.analysis.LoadColumnsInfo;

import java.util.List;

public class RoutineLoadDesc {
    private final ColumnSeparator columnSeparator;
    private final LoadColumnsInfo columnsInfo;
    private final Expr wherePredicate;
    private final List<String> partitionNames;

    public RoutineLoadDesc(ColumnSeparator columnSeparator, LoadColumnsInfo columnsInfo,
                           Expr wherePredicate, List<String> partitionNames) {
        this.columnSeparator = columnSeparator;
        this.columnsInfo = columnsInfo;
        this.wherePredicate = wherePredicate;
        this.partitionNames = partitionNames;
    }

    public ColumnSeparator getColumnSeparator() {
        return columnSeparator;
    }

    public LoadColumnsInfo getColumnsInfo() {
        return columnsInfo;
    }

    public Expr getWherePredicate() {
        return wherePredicate;
    }

    public List<String> getPartitionNames() {
        return partitionNames;
    }
}

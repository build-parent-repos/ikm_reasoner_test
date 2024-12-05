package org.semanticweb.elk.owlapi.query;

/*-
 * #%L
 * ELK OWL API v.4 Binding
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2011 - 2020 Department of Computer Science, University of Oxford
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.semanticweb.elk.owlapi.ElkReasoner;
import org.semanticweb.elk.reasoner.completeness.IncompleteResult;
import org.semanticweb.elk.reasoner.query.SatisfiabilityTestOutput;
import org.semanticweb.owlapi.model.OWLClassExpression;

public class OwlClassExpressionSatisfiabilityTestOutput
		extends SatisfiabilityTestOutput {

	public OwlClassExpressionSatisfiabilityTestOutput(
			IncompleteResult<? extends Boolean> incompleteIsSatisfiable) {
		super(incompleteIsSatisfiable);
	}

	public OwlClassExpressionSatisfiabilityTestOutput(boolean isSatisfiable) {
		super(isSatisfiable);
	}

	public OwlClassExpressionSatisfiabilityTestOutput(ElkReasoner reasoner,
			OWLClassExpression query) {
		this(reasoner.checkSatisfiability(query));
	}

}

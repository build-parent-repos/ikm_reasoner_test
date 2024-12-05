/*
 * #%L
 * ELK Reasoner
 * 
 * $Id$
 * $HeadURL$
 * %%
 * Copyright (C) 2011 Department of Computer Science, University of Oxford
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
/**
 * @author Markus Kroetzsch, Aug 8, 2011
 */
package org.semanticweb.elk.owl.interfaces;

import java.util.List;

import org.semanticweb.elk.owl.visitors.ElkEquivalentObjectPropertiesAxiomVisitor;

/**
 * Corresponds to an
 * <a href= "http://www.w3.org/TR/owl2-syntax/#Equivalent_Object_Properties">
 * Equivalent Object Properties Axiom</a> in the OWL 2 specification.
 * 
 * @author Markus Kroetzsch
 */
public interface ElkEquivalentObjectPropertiesAxiom
		extends ElkObjectPropertyAxiom {

	/**
	 * Get the list of equivalent object property expressions that this axiom
	 * refers to. The order of object property expressions does not affect the
	 * semantics but it is relevant to the syntax of OWL.
	 * 
	 * @return list of equivalent object property expressions
	 */
	public List<? extends ElkObjectPropertyExpression> getObjectPropertyExpressions();

	/**
	 * Accept an {@link ElkEquivalentObjectPropertiesAxiomVisitor}.
	 * 
	 * @param visitor
	 *            the visitor that can work with this axiom type
	 * @param <O>
	 *            the type of the output of the visitor
	 * @return the output of the visitor
	 */
	public abstract <O> O accept(
			ElkEquivalentObjectPropertiesAxiomVisitor<O> visitor);

	/**
	 * A factory for creating instances
	 * 
	 * @author Yevgeny Kazakov
	 *
	 */
	interface Factory {

		/**
		 * Create an {@link ElkEquivalentObjectPropertiesAxiom}.
		 * 
		 * @param first
		 *            the first equivalent {@link ElkObjectPropertyExpression}
		 *            for which the axiom should be created
		 * @param second
		 *            the second equivalent {@link ElkObjectPropertyExpression}
		 *            for which the axiom should be created
		 * @param other
		 *            other equivalent {@link ElkObjectPropertyExpression}s for
		 *            which the axiom should be created
		 * @return an {@link ElkEquivalentObjectPropertiesAxiom} corresponding
		 *         to the input
		 */
		public ElkEquivalentObjectPropertiesAxiom getEquivalentObjectPropertiesAxiom(
				ElkObjectPropertyExpression first,
				ElkObjectPropertyExpression second,
				ElkObjectPropertyExpression... other);

		/**
		 * Create an {@link ElkEquivalentObjectPropertiesAxiom}.
		 * 
		 * @param equivalentObjectPropertyExpressions
		 *            the equivalent {@link ElkObjectPropertyExpression}s for
		 *            which the axiom should be created
		 * @return an {@link ElkEquivalentObjectPropertiesAxiom} corresponding
		 *         to the input
		 */
		public ElkEquivalentObjectPropertiesAxiom getEquivalentObjectPropertiesAxiom(
				List<? extends ElkObjectPropertyExpression> equivalentObjectPropertyExpressions);
	}

}

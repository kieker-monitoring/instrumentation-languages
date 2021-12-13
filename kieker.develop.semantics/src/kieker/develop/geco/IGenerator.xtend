/***************************************************************************
 * Copyright 2017 GECO Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package kieker.develop.geco

/**
 * Transform a given source node S into a structure handled by T.
 * T might be a single node type of the target meta-model or a list
 * of result elements.
 * 
 * @author Reiner Jung
 *
 * @param <S> type of the source meta-model
 * @param <T> type of the target meta-model
 * 
 * @since 1.0
 */
interface IGenerator<S,T> {
	def T generate(S input)
}

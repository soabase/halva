/**
 * Copyright 2016 Jordan Zimmerman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.soabase.halva.processor.implicit;

import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;

class ImplicitItem
{
    private final ExecutableElement executableElement;
    private final FoundImplicit foundImplicit;

    ImplicitItem(ExecutableElement executableElement)
    {
        this(null, executableElement);
    }

    ImplicitItem(FoundImplicit foundImplicit, ExecutableElement executableElement)
    {
        this.foundImplicit = foundImplicit;
        this.executableElement = executableElement;
    }

    FoundImplicit getFoundImplicit()
    {
        return foundImplicit;
    }

    ExecutableElement getExecutableElement()
    {
        return executableElement;
    }
}

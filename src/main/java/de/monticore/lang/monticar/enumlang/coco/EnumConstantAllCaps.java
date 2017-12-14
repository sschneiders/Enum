/**
 *
 *  ******************************************************************************
 *  MontiCAR Modeling Family, www.se-rwth.de
 *  Copyright (c) 2017, Software Engineering Group at RWTH Aachen,
 *  All rights reserved.
 *
 *  This project is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 3.0 of the License, or (at your option) any later version.
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this project. If not, see <http://www.gnu.org/licenses/>.
 * *******************************************************************************
 */
package de.monticore.lang.monticar.enumlang.coco;

import de.monticore.lang.monticar.enumlang._ast.ASTEnumConstantDeclaration;
import de.monticore.lang.monticar.enumlang._cocos.EnumLangASTEnumConstantDeclarationCoCo;
import de.se_rwth.commons.logging.Log;

public class EnumConstantAllCaps implements EnumLangASTEnumConstantDeclarationCoCo {
    @Override
    public void check(ASTEnumConstantDeclaration node) {
        for (char c : node.getName().toCharArray()) {
            if (Character.isLetter(c) && !Character.isUpperCase(c)) {
                Log.error(
                        "Letters in names of enum constants must be all capitalized",
                        node.get_SourcePositionStart()
                );
            }
        }
    }
}

/**
 * ShapeChange - processing application schemas for geographic information
 *
 * This file is part of ShapeChange. ShapeChange takes a ISO 19109
 * Application Schema from a UML model and translates it into a
 * GML Application Schema or other implementation representations.
 *
 * Additional information about the software can be found at
 * http://shapechange.net/
 *
 * (c) 2002-2017 interactive instruments GmbH, Bonn, Germany
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact:
 * interactive instruments GmbH
 * Trierer Strasse 70-72
 * 53115 Bonn
 * Germany
 */
package de.interactive_instruments.ShapeChange.Target.SQL;

/**
 * @author Johannes Echterhoff (echterhoff <at> interactive-instruments
 *         <dot> de)
 *
 */
public class ReplicationSchemaConstants {

	/**
	 * XML Schema type of a field that contains the identifier of the object for
	 * which a data entity contains information. This parameter is optional. The
	 * default is {@value #DEFAULT_OBJECT_IDENTIFIER_FIELD_TYPE}.
	 */
	public static final String PARAM_OBJECT_IDENTIFIER_FIELD_TYPE = "replicationSchemaObjectIdentifierFieldType";

	/**
	 * XML Schema type of an element that represents a column that is a foreign
	 * key. This parameter is optional. The default is the value defined by
	 * configuration parameter {@value #PARAM_OBJECT_IDENTIFIER_FIELD_TYPE}.
	 */
	public static final String PARAM_FOREIGN_KEY_FIELD_TYPE = "replicationSchemaForeignKeyFieldType";

	/**
	 * Supports setting a suffix that will be appended to the target namespace
	 * of the replication schema that is produced by the target. This parameter
	 * is optional.
	 */
	public static final String PARAM_TARGET_NAMESPACE_SUFFIX = "replicationSchemaTargetNamespaceSuffix";

	/**
	 * The target namespace of the replication schema that is produced by the
	 * target. This parameter is optional. Default is the target namespace of
	 * the first schema that the target encounters, and which is actually
	 * encoded.
	 */
	public static final String PARAM_TARGET_NAMESPACE = "replicationSchemaTargetNamespace";

	/**
	 * Version of the replication schema that is produced by the target. This
	 * parameter is optional. Default is the version of the first schema that
	 * the target encounters, and which is actually encoded.
	 */
	public static final String PARAM_TARGET_VERSION = "replicationSchemaTargetVersion";

	/**
	 * XML namespace abbreviation (xmlns) of the replication schema that is
	 * produced by the target. This parameter is optional. Default is the XML
	 * namespace abbreviation of the first schema that the target encounters,
	 * and which is actually encoded.
	 */
	public static final String PARAM_TARGET_XMLNS = "replicationSchemaTargetXmlns";

	/**
	 * Provides the value to be set as documentation of elements whose length is
	 * not restricted.
	 */
	public static final String PARAM_DOCUMENTATION_UNLIMITEDLENGTHCHARACTERDATATYPE = "replicationSchemaDocumentationForFieldWithUnlimitedLengthCharacterDataType";

	/**
	 * (available since after v2.3.0) If this rule is included, the target
	 * creates an internal SQL structure. However, instead of deriving DDL from
	 * this structure, a replication schema is derived.
	 * 
	 */
	public static final String RULE_TGT_SQL_ALL_REPSCHEMA = "rule-sql-all-replicationSchema";

	/**
	 * If this rule is enabled all elements that represent properties from the
	 * conceptual schema will have minOccurs=0. This does not apply to elements
	 * that were generated by the target, for example object identifier
	 * elements.
	 */
	public static final String RULE_TGT_SQL_PROP_REPSCHEMA_OPTIONAL = "rule-sql-prop-replicationSchema-optional";

	/**
	 * If this rule is enabled then the length of properties with a size > 0 is
	 * restricted using a maxLength restriction.
	 */
	public static final String RULE_TGT_SQL_PROP_REPSCHEMA_MAXLENGTHFROMSIZE = "rule-sql-prop-replicationSchema-maxLength-from-size";

	/**
	 * If this rule is included, and the size of the property represented by a
	 * column is unlimited, the follow-ing documentation is added to the XML
	 * element that represents the column: “May contain a very large character
	 * string.”
	 */
	public static final String RULE_TGT_SQL_PROP_REPSCHEMA_DOCUMENTATION_UNLIMITEDLENGTHCHARACTERDATATYPE = "rule-sql-prop-replicationSchema-documentation-fieldWithUnlimitedLengthCharacterDataType";

	/**
	 * If this rule is included, the attribute nillable=true will be added to
	 * elements that represent columns without a NOT NULL restriction (excluding
	 * columns that do not represent a property from the model).
	 */
	public static final String RULE_TGT_PROP_REPSCHEMA_NILLABLE = "rule-sql-prop-replicationSchema-nillable";

	/* ----------------------------------------- */
	/* --- Other fields --- */
	/* ----------------------------------------- */
	public static final String DEFAULT_OBJECT_IDENTIFIER_FIELD_TYPE = "string";
	public static final String DEFAULT_TARGET_NAMESPACE_SUFFIX = "";
	public static final String DEFAULT_DOCUMENTATION_UNLIMITEDLENGTHCHARACTERDATATYPE = "May contain a very large character string.";
}

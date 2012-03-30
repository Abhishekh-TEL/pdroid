
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:



Copyright (c) 2001 World Wide Web Consortium, 
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University).  All 
Rights Reserved.  This program is distributed under the W3C's Software
Intellectual Property License.  This program is distributed in the 
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR 
PURPOSE.  

See W3C License http://www.w3.org/Consortium/Legal/ for more details.


*/

package org.w3c.domts.level2.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *  The method createAttributeNS creates an attribute of the given qualified name and namespace URI
 *  
 *  Invoke the createAttributeNS method on this Document object with a valid values for 
 *  namespaceURI, and a qualifiedName as below.  This should return a valid Attr node.
* @author IBM
* @author Neil Delima
* @see <a href="http://www.w3.org/TR/DOM-Level-2-Core/core">http://www.w3.org/TR/DOM-Level-2-Core/core</a>
* @see <a href="http://www.w3.org/TR/DOM-Level-2-Core/core#ID-DocCrAttrNS">http://www.w3.org/TR/DOM-Level-2-Core/core#ID-DocCrAttrNS</a>
*/
public final class documentcreateattributeNS02 extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public documentcreateattributeNS02(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "staffNS", false);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      Document doc;
      Attr attribute1;
      Attr attribute2;
      String name;
      String nodeName;
      String nodeValue;
      String prefix;
      String namespaceURI;
      doc = (Document) load("staffNS", false);
      attribute1 = doc.createAttributeNS("http://www.w3.org/XML/1998/namespace", "xml:xml");
      name = attribute1.getName();
      nodeName = attribute1.getNodeName();
      nodeValue = attribute1.getNodeValue();
      prefix = attribute1.getPrefix();
      namespaceURI = attribute1.getNamespaceURI();
      assertEquals("documentcreateattributeNS02_att1_name", "xml:xml", name);
      assertEquals("documentcreateattributeNS02_att1_nodeName", "xml:xml", nodeName);
      assertEquals("documentcreateattributeNS02_att1_nodeValue", "", nodeValue);
      assertEquals("documentcreateattributeNS02_att1_prefix", "xml", prefix);
      assertEquals("documentcreateattributeNS02_att1_namespaceURI", "http://www.w3.org/XML/1998/namespace", namespaceURI);
      attribute2 = doc.createAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns");
      name = attribute2.getName();
      nodeName = attribute2.getNodeName();
      nodeValue = attribute2.getNodeValue();
      prefix = attribute2.getPrefix();
      namespaceURI = attribute2.getNamespaceURI();
      assertEquals("documentcreateattributeNS02_att2_name", "xmlns", name);
      assertEquals("documentcreateattributeNS02_att2_nodeName", "xmlns", nodeName);
      assertEquals("documentcreateattributeNS02_att2_nodeValue", "", nodeValue);
      assertEquals("documentcreateattributeNS02_att2_namespaceURI", "http://www.w3.org/2000/xmlns/", namespaceURI);
      }
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level2/core/documentcreateattributeNS02";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(documentcreateattributeNS02.class, args);
   }
}

package creational.prototype

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class OrganizationTest{
    @Test
    fun testOrganizationCompanyCloneObjectID(){
        val org : Organization = Company()
        org.name = "SeaOil"
        org.id = 1
        org.address = "Philippines"

        val company : Organization = org.clone() as Company
        assertNotEquals(org, company)
    }

    @Test
    fun testOrganizationCompanyCloneAttributeName() {
        val org : Organization = Company()
        org.name = "SeaOil"
        org.id = 1
        org.address = "Philippines"

        val company : Organization = org.clone() as Company
        assertEquals(org.name, company.name)
    }

    @Test
    fun testOrganizationCompanyCloneAttributeId() {
        val org : Organization = Company()
        org.name = "SeaOil"
        org.id = 1
        org.address = "Philippines"

        val company : Organization = org.clone() as Company
        assertEquals(org.id, company.id)
    }

    @Test
    fun testOrganizationCompanyCloneAttributeAddress() {
        val org : Organization = Company()
        org.name = "SeaOil"
        org.id = 1
        org.address = "Philippines"

        val company : Organization = org.clone() as Company
        assertEquals(org.address, company.address)
    }

    @Test
    fun testOrganizationCommunityCloneObjectID(){
        val org: Organization = Community()
        org.name = "PADC"
        org.id = 1
        org.address = "Philippines"

        val community : Organization = org.clone() as Community
        assertNotEquals(org, community)
    }

    @Test
    fun testOrganizationCommunityCloneAttributeName(){
        val org: Organization = Community()
        org.name = "PADC"
        org.id = 1
        org.address = "Philippines"

        val community : Organization = org.clone() as Community
        assertEquals(org.name, community.name)
    }

    @Test
    fun testOrganizationCommunityCloneAttributeId(){
        val org: Organization = Community()
        org.name = "PADC"
        org.id = 1
        org.address = "Philippines"

        val community : Organization = org.clone() as Community
        assertEquals(org.id, community.id)
    }

    @Test
    fun testOrganizationCommunityCloneAttributeAddress(){
        val org: Organization = Community()
        org.name = "PADC"
        org.id = 1
        org.address = "Philippines"

        val community : Organization = org.clone() as Community
        assertEquals(org.address, community.address)
    }
}
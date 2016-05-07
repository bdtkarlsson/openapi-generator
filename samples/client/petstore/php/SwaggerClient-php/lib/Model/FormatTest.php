<?php
/**
 * FormatTest
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
/**
 *  Copyright 2016 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
/**
 * FormatTest Class Doc Comment
 *
 * @category    Class
 * @description 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class FormatTest implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    static $swaggerModelName = 'format_test';

    /**
      * Array of property to type mappings. Used for (de)serialization 
      * @var string[]
      */
    static $swaggerTypes = array(
        'integer' => 'int',
        'int32' => 'int',
        'int64' => 'int',
        'number' => 'float',
        'float' => 'float',
        'double' => 'double',
        'string' => 'string',
        'byte' => 'string',
        'binary' => 'string',
        'date' => '\DateTime',
        'date_time' => '\DateTime',
        'uuid' => 'string',
        'password' => 'string'
    );
 
    static function swaggerTypes() {
        return self::$swaggerTypes;
    }

    /** 
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    static $attributeMap = array(
        'integer' => 'integer',
        'int32' => 'int32',
        'int64' => 'int64',
        'number' => 'number',
        'float' => 'float',
        'double' => 'double',
        'string' => 'string',
        'byte' => 'byte',
        'binary' => 'binary',
        'date' => 'date',
        'date_time' => 'dateTime',
        'uuid' => 'uuid',
        'password' => 'password'
    );
 
    static function attributeMap() {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    static $setters = array(
        'integer' => 'setInteger',
        'int32' => 'setInt32',
        'int64' => 'setInt64',
        'number' => 'setNumber',
        'float' => 'setFloat',
        'double' => 'setDouble',
        'string' => 'setString',
        'byte' => 'setByte',
        'binary' => 'setBinary',
        'date' => 'setDate',
        'date_time' => 'setDateTime',
        'uuid' => 'setUuid',
        'password' => 'setPassword'
    );
 
    static function setters() {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    static $getters = array(
        'integer' => 'getInteger',
        'int32' => 'getInt32',
        'int64' => 'getInt64',
        'number' => 'getNumber',
        'float' => 'getFloat',
        'double' => 'getDouble',
        'string' => 'getString',
        'byte' => 'getByte',
        'binary' => 'getBinary',
        'date' => 'getDate',
        'date_time' => 'getDateTime',
        'uuid' => 'getUuid',
        'password' => 'getPassword'
    );
 
    static function getters() {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = array(
        /**
         * $container['integer']
         * @var int
         */
        'integer' => null,
    
        /**
         * $container['int32']
         * @var int
         */
        'int32' => null,
    
        /**
         * $container['int64']
         * @var int
         */
        'int64' => null,
    
        /**
         * $container['number']
         * @var float
         */
        'number' => null,
    
        /**
         * $container['float']
         * @var float
         */
        'float' => null,
    
        /**
         * $container['double']
         * @var double
         */
        'double' => null,
    
        /**
         * $container['string']
         * @var string
         */
        'string' => null,
    
        /**
         * $container['byte']
         * @var string
         */
        'byte' => null,
    
        /**
         * $container['binary']
         * @var string
         */
        'binary' => null,
    
        /**
         * $container['date']
         * @var \DateTime
         */
        'date' => null,
    
        /**
         * $container['date_time']
         * @var \DateTime
         */
        'date_time' => null,
    
        /**
         * $container['uuid']
         * @var string
         */
        'uuid' => null,
    
        /**
         * $container['password']
         * @var string
         */
        'password' => null,
    );

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        
        
        if ($data != null) {
            if (isset($data["integer"])) {
                $this->container['integer'] = $data["integer"];
            }
            if (isset($data["int32"])) {
                $this->container['int32'] = $data["int32"];
            }
            if (isset($data["int64"])) {
                $this->container['int64'] = $data["int64"];
            }
            if (isset($data["number"])) {
                $this->container['number'] = $data["number"];
            }
            if (isset($data["float"])) {
                $this->container['float'] = $data["float"];
            }
            if (isset($data["double"])) {
                $this->container['double'] = $data["double"];
            }
            if (isset($data["string"])) {
                $this->container['string'] = $data["string"];
            }
            if (isset($data["byte"])) {
                $this->container['byte'] = $data["byte"];
            }
            if (isset($data["binary"])) {
                $this->container['binary'] = $data["binary"];
            }
            if (isset($data["date"])) {
                $this->container['date'] = $data["date"];
            }
            if (isset($data["date_time"])) {
                $this->container['date_time'] = $data["date_time"];
            }
            if (isset($data["uuid"])) {
                $this->container['uuid'] = $data["uuid"];
            }
            if (isset($data["password"])) {
                $this->container['password'] = $data["password"];
            }
        }
    }

    /**
     * show all the invalid properties with reasons.
     * 
     * @return array invalid properties with reasons
     */
    public function list_invalid_properties()
    {
        $invalid_properties = array();
        
        
        if ($this->container['integer'] > 100.0) {
            $invalid_properties[] = "invalid value for '$integer', must be smaller than or equal to 100.0.";
        }
        if ($this->container['integer'] < 10.0) {
            $invalid_properties[] = "invalid value for '$integer', must be bigger than or equal to 10.0.";
        }

        
        if ($this->container['int32'] > 200.0) {
            $invalid_properties[] = "invalid value for '$int32', must be smaller than or equal to 200.0.";
        }
        if ($this->container['int32'] < 20.0) {
            $invalid_properties[] = "invalid value for '$int32', must be bigger than or equal to 20.0.";
        }

        

        if ($this->container['number'] === null) {
            $invalid_properties[] = "'$number' can't be null";
        }
        
        if ($this->container['number'] > 543.2) {
            $invalid_properties[] = "invalid value for '$number', must be smaller than or equal to 543.2.";
        }
        if ($this->container['number'] < 32.1) {
            $invalid_properties[] = "invalid value for '$number', must be bigger than or equal to 32.1.";
        }

        
        if ($this->container['float'] > 987.6) {
            $invalid_properties[] = "invalid value for '$float', must be smaller than or equal to 987.6.";
        }
        if ($this->container['float'] < 54.3) {
            $invalid_properties[] = "invalid value for '$float', must be bigger than or equal to 54.3.";
        }

        
        if ($this->container['double'] > 123.4) {
            $invalid_properties[] = "invalid value for '$double', must be smaller than or equal to 123.4.";
        }
        if ($this->container['double'] < 67.8) {
            $invalid_properties[] = "invalid value for '$double', must be bigger than or equal to 67.8.";
        }

        
        if (!preg_match("/[a-z]/i", $this->container['string'])) {
            $invalid_properties[] = "invalid value for '$string', must be conform to the pattern /[a-z]/i.";
        }
        
        if ($this->container['byte'] === null) {
            $invalid_properties[] = "'$byte' can't be null";
        }
        

        

        if ($this->container['date'] === null) {
            $invalid_properties[] = "'$date' can't be null";
        }
        

        

        

        if ($this->container['password'] === null) {
            $invalid_properties[] = "'$password' can't be null";
        }
        
        if (strlen($this->container['password']) > 64) {
            $invalid_properties[] = "invalid value for '$password', the character length must be smaller than or equal to 64.";
        }
        if (strlen($this->container['password']) < 10) {
            $invalid_properties[] = "invalid value for '$password', the character length must be bigger than or equal to 10.";
        }

        return $invalid_properties;
    }

    /**
     * validate all the parameters in the model
     * return true if all passed
     * 
     * @return bool [description]
     */
    public function valid()
    {
        
        
        if ($this->container['integer'] > 100.0) {
            return false;
        }
        if ($this->container['integer'] < 10.0) {
            return false;
        }

        
        if ($this->container['int32'] > 200.0) {
            return false;
        }
        if ($this->container['int32'] < 20.0) {
            return false;
        }

        

        if ($this->container['number'] === null) {
            return false;
        }
        
        if ($this->container['number'] > 543.2) {
            return false;
        }
        if ($this->container['number'] < 32.1) {
            return false;
        }

        
        if ($this->container['float'] > 987.6) {
            return false;
        }
        if ($this->container['float'] < 54.3) {
            return false;
        }

        
        if ($this->container['double'] > 123.4) {
            return false;
        }
        if ($this->container['double'] < 67.8) {
            return false;
        }

        
        if (!preg_match("/[a-z]/i", $this->container['string'])) {
            return false;
        }
        
        if ($this->container['byte'] === null) {
            return false;
        }
        

        

        if ($this->container['date'] === null) {
            return false;
        }
        

        

        

        if ($this->container['password'] === null) {
            return false;
        }
        
        if (strlen($this->container['password']) > 64) {
            return false;
        }
        if (strlen($this->container['password']) < 10) {
            return false;
        }

        return true;
    }


    /**
     * Gets integer
     * @return int
     */
    public function getInteger()
    {
        return $this->container['integer'];
    }

    /**
     * Sets integer
     * @param int $integer 
     * @return $this
     */
    public function setInteger($integer)
    {
        


        if ($integer > 100.0) {
            throw new \InvalidArgumentException('invalid value for $integer when calling FormatTest., must be smaller than or equal to 100.0.');
        }
        if ($integer < 10.0) {
            throw new \InvalidArgumentException('invalid value for $integer when calling FormatTest., must be bigger than or equal to 10.0.');
        }

        $this->container['integer'] = $integer;

        return $this;
    }
    /**
     * Gets int32
     * @return int
     */
    public function getInt32()
    {
        return $this->container['int32'];
    }

    /**
     * Sets int32
     * @param int $int32 
     * @return $this
     */
    public function setInt32($int32)
    {
        


        if ($int32 > 200.0) {
            throw new \InvalidArgumentException('invalid value for $int32 when calling FormatTest., must be smaller than or equal to 200.0.');
        }
        if ($int32 < 20.0) {
            throw new \InvalidArgumentException('invalid value for $int32 when calling FormatTest., must be bigger than or equal to 20.0.');
        }

        $this->container['int32'] = $int32;

        return $this;
    }
    /**
     * Gets int64
     * @return int
     */
    public function getInt64()
    {
        return $this->container['int64'];
    }

    /**
     * Sets int64
     * @param int $int64 
     * @return $this
     */
    public function setInt64($int64)
    {
        


        $this->container['int64'] = $int64;

        return $this;
    }
    /**
     * Gets number
     * @return float
     */
    public function getNumber()
    {
        return $this->container['number'];
    }

    /**
     * Sets number
     * @param float $number 
     * @return $this
     */
    public function setNumber($number)
    {
        


        if ($number > 543.2) {
            throw new \InvalidArgumentException('invalid value for $number when calling FormatTest., must be smaller than or equal to 543.2.');
        }
        if ($number < 32.1) {
            throw new \InvalidArgumentException('invalid value for $number when calling FormatTest., must be bigger than or equal to 32.1.');
        }

        $this->container['number'] = $number;

        return $this;
    }
    /**
     * Gets float
     * @return float
     */
    public function getFloat()
    {
        return $this->container['float'];
    }

    /**
     * Sets float
     * @param float $float 
     * @return $this
     */
    public function setFloat($float)
    {
        


        if ($float > 987.6) {
            throw new \InvalidArgumentException('invalid value for $float when calling FormatTest., must be smaller than or equal to 987.6.');
        }
        if ($float < 54.3) {
            throw new \InvalidArgumentException('invalid value for $float when calling FormatTest., must be bigger than or equal to 54.3.');
        }

        $this->container['float'] = $float;

        return $this;
    }
    /**
     * Gets double
     * @return double
     */
    public function getDouble()
    {
        return $this->container['double'];
    }

    /**
     * Sets double
     * @param double $double 
     * @return $this
     */
    public function setDouble($double)
    {
        


        if ($double > 123.4) {
            throw new \InvalidArgumentException('invalid value for $double when calling FormatTest., must be smaller than or equal to 123.4.');
        }
        if ($double < 67.8) {
            throw new \InvalidArgumentException('invalid value for $double when calling FormatTest., must be bigger than or equal to 67.8.');
        }

        $this->container['double'] = $double;

        return $this;
    }
    /**
     * Gets string
     * @return string
     */
    public function getString()
    {
        return $this->container['string'];
    }

    /**
     * Sets string
     * @param string $string 
     * @return $this
     */
    public function setString($string)
    {
        


        if (!preg_match("/[a-z]/i", $string)) {
            throw new \InvalidArgumentException('invalid value for $string when calling FormatTest., must be conform to the pattern /[a-z]/i.');
        }
        
        $this->container['string'] = $string;

        return $this;
    }
    /**
     * Gets byte
     * @return string
     */
    public function getByte()
    {
        return $this->container['byte'];
    }

    /**
     * Sets byte
     * @param string $byte 
     * @return $this
     */
    public function setByte($byte)
    {
        


        $this->container['byte'] = $byte;

        return $this;
    }
    /**
     * Gets binary
     * @return string
     */
    public function getBinary()
    {
        return $this->container['binary'];
    }

    /**
     * Sets binary
     * @param string $binary 
     * @return $this
     */
    public function setBinary($binary)
    {
        


        $this->container['binary'] = $binary;

        return $this;
    }
    /**
     * Gets date
     * @return \DateTime
     */
    public function getDate()
    {
        return $this->container['date'];
    }

    /**
     * Sets date
     * @param \DateTime $date 
     * @return $this
     */
    public function setDate($date)
    {
        


        $this->container['date'] = $date;

        return $this;
    }
    /**
     * Gets date_time
     * @return \DateTime
     */
    public function getDateTime()
    {
        return $this->container['date_time'];
    }

    /**
     * Sets date_time
     * @param \DateTime $date_time 
     * @return $this
     */
    public function setDateTime($date_time)
    {
        


        $this->container['date_time'] = $date_time;

        return $this;
    }
    /**
     * Gets uuid
     * @return string
     */
    public function getUuid()
    {
        return $this->container['uuid'];
    }

    /**
     * Sets uuid
     * @param string $uuid 
     * @return $this
     */
    public function setUuid($uuid)
    {
        


        $this->container['uuid'] = $uuid;

        return $this;
    }
    /**
     * Gets password
     * @return string
     */
    public function getPassword()
    {
        return $this->container['password'];
    }

    /**
     * Sets password
     * @param string $password 
     * @return $this
     */
    public function setPassword($password)
    {
        

        if (strlen($password) > 64) {
            throw new \InvalidArgumentException('invalid length for $password when calling FormatTest., must be smaller than or equal to 64.');
        }
        if (strlen($password) < 10) {
            throw new \InvalidArgumentException('invalid length for $password when calling FormatTest., must be bigger than or equal to 10.');
        }

        $this->container['password'] = $password;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset 
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset 
     * @return mixed 
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }
 
    /**
     * Sets value based on offset.
     * @param  integer $offset Offset 
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }
 
    /**
     * Unsets offset.
     * @param  integer $offset Offset 
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }
 
    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}

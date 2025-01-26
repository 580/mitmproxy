/*
 * BrowserUp MitmProxy
 *
 * ___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = BrowserUp.Mitmproxy.Client.Client.OpenAPIDateConverter;

namespace BrowserUp.Mitmproxy.Client.Model
{
    /// <summary>
    /// LargestContentfulPaint
    /// </summary>
    [DataContract(Name = "LargestContentfulPaint")]
    public partial class LargestContentfulPaint : Dictionary<String, Object>, IEquatable<LargestContentfulPaint>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LargestContentfulPaint" /> class.
        /// </summary>
        /// <param name="startTime">startTime (default to -1).</param>
        /// <param name="size">size (default to -1).</param>
        /// <param name="domPath">domPath (default to &quot;&quot;).</param>
        /// <param name="tag">tag (default to &quot;&quot;).</param>
        public LargestContentfulPaint(long startTime = -1, long size = -1, string domPath = @"", string tag = @"") : base()
        {
            this.StartTime = startTime;
            this.Size = size;
            // use default value if no "domPath" provided
            this.DomPath = domPath ?? @"";
            // use default value if no "tag" provided
            this.Tag = tag ?? @"";
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets StartTime
        /// </summary>
        [DataMember(Name = "startTime", EmitDefaultValue = false)]
        public long StartTime { get; set; }

        /// <summary>
        /// Gets or Sets Size
        /// </summary>
        [DataMember(Name = "size", EmitDefaultValue = false)]
        public long Size { get; set; }

        /// <summary>
        /// Gets or Sets DomPath
        /// </summary>
        [DataMember(Name = "domPath", EmitDefaultValue = false)]
        public string DomPath { get; set; }

        /// <summary>
        /// Gets or Sets Tag
        /// </summary>
        [DataMember(Name = "tag", EmitDefaultValue = false)]
        public string Tag { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LargestContentfulPaint {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  StartTime: ").Append(StartTime).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  DomPath: ").Append(DomPath).Append("\n");
            sb.Append("  Tag: ").Append(Tag).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as LargestContentfulPaint);
        }

        /// <summary>
        /// Returns true if LargestContentfulPaint instances are equal
        /// </summary>
        /// <param name="input">Instance of LargestContentfulPaint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LargestContentfulPaint input)
        {
            if (input == null)
            {
                return false;
            }
            return base.Equals(input) && 
                (
                    this.StartTime == input.StartTime ||
                    this.StartTime.Equals(input.StartTime)
                ) && base.Equals(input) && 
                (
                    this.Size == input.Size ||
                    this.Size.Equals(input.Size)
                ) && base.Equals(input) && 
                (
                    this.DomPath == input.DomPath ||
                    (this.DomPath != null &&
                    this.DomPath.Equals(input.DomPath))
                ) && base.Equals(input) && 
                (
                    this.Tag == input.Tag ||
                    (this.Tag != null &&
                    this.Tag.Equals(input.Tag))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = base.GetHashCode();
                hashCode = (hashCode * 59) + this.StartTime.GetHashCode();
                hashCode = (hashCode * 59) + this.Size.GetHashCode();
                if (this.DomPath != null)
                {
                    hashCode = (hashCode * 59) + this.DomPath.GetHashCode();
                }
                if (this.Tag != null)
                {
                    hashCode = (hashCode * 59) + this.Tag.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            return this.BaseValidate(validationContext);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        protected IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> BaseValidate(ValidationContext validationContext)
        {
            // StartTime (long) minimum
            if (this.StartTime < (long)-1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for StartTime, must be a value greater than or equal to -1.", new [] { "StartTime" });
            }

            // Size (long) minimum
            if (this.Size < (long)-1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Size, must be a value greater than or equal to -1.", new [] { "Size" });
            }

            yield break;
        }
    }

}
